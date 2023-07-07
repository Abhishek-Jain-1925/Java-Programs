//Adding JDBC Controls by using Frame,Swing & other Components.

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Myfrm1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	
	Connection cn;
	Statement stm;
	PreparedStatement prstm;
	String sql;
	int roll,age;
	String name;
	
	Myfrm1()
	{
		super("DB Connectivity");
		setLayout(null);
		setLocation(500,150);
		setSize(500,200);
		
		l1 = new JLabel("Roll No. :");
		l2 = new JLabel("Name :");
		l3 = new JLabel("Age :");
		t1 = new JTextField("");
		t2 = new JTextField("");
		t3 = new JTextField("");
		b1 = new JButton("Clear");
		b2 = new JButton("Insert");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");
		b5 = new JButton("Exit");
		
		add(l1);	add(l2);	add(l3);	add(t1);	add(t2);	add(t3);
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);
		
		l1.setBounds(20,20,100,20);
		t1.setBounds(130,20,150,20);
		l2.setBounds(20,50,100,20);
		t2.setBounds(130,50,150,20);
		l3.setBounds(20,80,100,20);
		t3.setBounds(130,80,150,20);
		b1.setBounds(20,120,80,30);
		b2.setBounds(110,120,80,30);
		b3.setBounds(200,120,80,30);
		b4.setBounds(290,120,80,30);
		b5.setBounds(380,120,60,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}//End of Constructor(Myfrm1)
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(e.getSource()==b5)
		{
			System.exit(0);
		}
		try{
		//for Insert into Database.
		if(e.getSource()==b2)
		{
			roll = Integer.parseInt(t1.getText());
			name = t2.getText();
			age = Integer.parseInt(t3.getText());
			
			sql = "insert into mytable values("+roll+",'"+name+"',"+age+")";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Inserted..!!!");
		}
		
		//for Update into database
		if(e.getSource()==b3)
		{
			roll = Integer.parseInt(t1.getText());
			name = t2.getText();
			age = Integer.parseInt(t3.getText());
			
			sql = "update mytable set name='"+name+"',age="+age+" where roll="+roll;
			//sql = "update mytable set name=' " +name+ " ',age="+age+" where roll="+roll+"";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Updated..!!!");
		}
		if(e.getSource()==b4)
		{
			roll = Integer.parseInt(t1.getText());
			
			sql = "delete from mytable where roll="+roll;
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Deleted..!!!");
		}
	}catch(NumberFormatException nfe)
	{JOptionPane.showMessageDialog(null,"Fields Cannot be Empty","Invalid Filled of Info",JOptionPane.ERROR_MESSAGE);}
	catch(Exception ae)
	{System.out.println(ae);}
	}
}//End of class

class frame1
{
	public static void main(String[] asjd)
	{
		new Myfrm1();
	}
}



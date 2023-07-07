//Adding JDBC Controls by using Frame,Swing & other Components.
//also shows immediate reflect 

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Myfrm2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	JButton fst,lst,pre,nxt;
	
	Connection cn;
	Statement stm;
	PreparedStatement prstm;
	ResultSet rs;
	String sql;
	int roll,age;
	String name;
	
	Myfrm2()
	{
		super("DB Connectivity");
		setLayout(null);
		setLocation(500,150);
		setSize(500,270);
		
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
		nxt = new JButton("Next");
		pre = new JButton("Prev.");
		fst = new JButton("First");
		lst = new JButton("Last");
		
		add(l1);	add(l2);	add(l3);	add(t1);	add(t2);	add(t3);
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);
		add(nxt);	add(pre);	add(fst);	add(lst);
		
		
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
		b5.setBounds(380,120,60,70);//
		nxt.setBounds(20,160,80,30);
		pre.setBounds(110,160,80,30);
		fst.setBounds(200,160,80,30);
		lst.setBounds(290,160,80,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		fst.addActionListener(this);
		lst.addActionListener(this);
		pre.addActionListener(this);
		nxt.addActionListener(this);
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
			stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stm.executeQuery("select * from mytable order by roll");
			rs.first();
			display();
			
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
			refresh();
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
			refresh();
		}
		if(e.getSource()==b4)
		{
			roll = Integer.parseInt(t1.getText());
			
			sql = "delete from mytable where roll="+roll;
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Deleted..!!!");
			refresh();
		}
		if(e.getSource()==fst)
		{
			rs.first();
			display();
		}
		if(e.getSource()==lst)
		{
			rs.last();
			display();
		}
		if(e.getSource()==nxt)
		{
			rs.next();
			if(rs.isAfterLast())
				rs.last();
			
			display();
		}
		if(e.getSource()==pre)
		{
			rs.previous();
			if(rs.isBeforeFirst())
				rs.first();
			
			display();
		}
	}catch(NumberFormatException nfe)
	{JOptionPane.showMessageDialog(null,"Fields Cannot be Empty","Invalid Fill-up of Info",JOptionPane.ERROR_MESSAGE);}
	catch(Exception ae)
	{System.out.println(ae);}
	}
	
	public void refresh()
	{
		try{
			rs = stm.executeQuery("select * from mytable order by roll");
			rs.next();
			display();
			prstm.close();
		}
		catch(Exception xx)
		{xx.printStackTrace();}
	}
	
	public void display()
	{
		
		try{
			t1.setText(rs.getString(1));
			t2.setText(rs.getString(2));
			t3.setText(rs.getString(3));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}//End of display func.
}//End of class



class frame2
{
	public static void main(String[] asjd)
	{
		new Myfrm2();
	}
}






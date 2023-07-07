//Phone Book App

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Myfrm2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4,b5,b6;
	JButton pre,nxt;
	
	Connection cn;
	Statement stm;
	PreparedStatement prstm;
	ResultSet rs;
	String sql;
	String name,addr,phone,mail;
	
	Myfrm2()
	{
		super(" Phone Book App. ");
		setLayout(null);
		setLocation(500,150);
		setSize(600,270);
		
		l1 = new JLabel("Name :");
		l2 = new JLabel("Address :");
		l3 = new JLabel("Phone :");
		l4 = new JLabel("E-Mail :");
		t1 = new JTextField("");
		t2 = new JTextField("");
		t3 = new JTextField("");
		t4 = new JTextField("");
		b1 = new JButton("  <<  ");
		b2 = new JButton(" ADD ");
		b3 = new JButton(" UPDATE ");
		b4 = new JButton(" DELETE ");
		b5 = new JButton("  >>  ");
		b6 = new JButton("Exit");
		
		add(l1);	add(l2);	add(l3);	add(t1);	add(t2);	add(t3);
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);
		add(l4);	add(t4);	add(b6);
		
		
		l1.setBounds(20,20,100,20);
		t1.setBounds(130,20,200,25);
		l2.setBounds(20,50,100,20);
		t2.setBounds(130,50,200,25);
		l3.setBounds(20,80,100,20);
		t3.setBounds(130,80,200,25);
		l4.setBounds(20,110,100,20);
		t4.setBounds(130,110,200,25);
		b1.setBounds(20,160,70,30);
		b2.setBounds(100,160,80,30);
		b3.setBounds(190,160,100,30);
		b4.setBounds(300,160,100,30);
		b5.setBounds(410,160,70,30);//
		b6.setBounds(490,160,80,30);
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
			stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stm.executeQuery("select * from phoneBook");
			rs.first();
			//display();
			
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
		if(e.getSource()==b6)
		{
			System.exit(0);
		}
		try{
		//for Insert into Database.
		if(e.getSource()==b2)
		{
			phone = (t3.getText());
			name = t1.getText();
			addr = t2.getText();
			mail = t4.getText();
			
			sql = "insert into phonebook values('"+name+"','"+addr+"','"+phone+"','"+mail+"')";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Inserted..!!!");
			refresh();
		}
		
		//for Update into database
		if(e.getSource()==b3)
		{
			phone =(t3.getText());
			name = t1.getText();
			addr = t2.getText();
			mail = t4.getText();
			
			sql = "update phonebook set name='"+name+"',addr='"+addr+"' where phone='"+phone+"'";
			//sql = "update mytable set name=' " +name+ " ',age="+age+" where roll="+roll+"";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Updated..!!!");
			refresh();
		}
		if(e.getSource()==b4)
		{
			phone=(t1.getText());
			
			sql = "delete from phonebook where phone='"+phone+"'";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Deleted..!!!");
			refresh();
		}
		
		if(e.getSource()==b5)
		{
			rs.next();
			if(rs.isAfterLast())
				rs.last();
			
			display();
		}
		if(e.getSource()==b1)
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
			rs = stm.executeQuery("select * from phonebook");
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
			t3.setText(rs.getString(4));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}//End of display func.
}//End of class



class phoneBookApp
{
	public static void main(String[] asjd)
	{
		new Myfrm2();
	}
}
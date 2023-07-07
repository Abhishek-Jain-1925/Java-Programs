package Jdbc_prg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


import javax.swing.*;


class Registration_form extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	
	Registration_form()
	{
		 setVisible(true);
		 setTitle("Registration Form");
		 setLayout(null);
		 setSize(500,500);
		 setLocation(400,200);
		 
		 l1 = new JLabel("Enter Roll_No");
		 l2 = new JLabel("Enter Name");
		 l3 = new JLabel("Enter Age");
		 
		 t1 = new JTextField();
		 t2 = new JTextField();
		 t3 = new JTextField();
		 
		 b1 = new JButton("INSERT");
		 b2 = new JButton("DELETE");
		 
		 add(l1);	add(l2);	add(l3);	add(t1);	 add(t2);	add(t3);	add(b1); add(b2);
		 
		 l1.setBounds(100, 100, 100, 30);
		 t1.setBounds(210, 100, 100, 30);
		 
		 l2.setBounds(100, 150, 100, 30);
		 t2.setBounds(210, 150, 100, 30);
		 
		 l3.setBounds(100, 190, 100, 30);
		 t3.setBounds(210, 190, 100, 30);
		 
		 
		 b1.setBounds(150, 230, 100, 30);
		 b2.setBounds(150,280,100,30);
		 
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Connection cn = null;
			PreparedStatement psmt;
			if(e.getSource()==b1)
			{
				int Roll_No,age;
				String Name;
				
				
				 cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aavej","root","");
				 psmt = cn.prepareStatement("insert into student values(?,?,?)");
				
				//  "insert into student values(" +Roll_No+ ", '" +Name+ "', "+age+")";
				
				
				
				Roll_No=Integer.parseInt(t1.getText());
				Name=t2.getText();
				age=Integer.parseInt(t3.getText());
				
				psmt.setInt(1,Roll_No);
				psmt.setString(2, Name);
				psmt.setInt(3, age);
				
				psmt.execute();
				
				JOptionPane.showMessageDialog(null, "Record Inserted Succesfully");
				
				cn.close();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Record NOT Insert Succesfully");
		}
			
			
			
		if (e.getSource()==b2)
		{
			
			
			psmt = cn.prepareStatement("DELETE into student values(?,?,?)");
			
			JOptionPane.showMessageDialog(null, "Record Deleted Succesfully");
		}	
		else
		{
			JOptionPane.showMessageDialog(null, "Record NOT Deleted Succesfully");
		}
		
		
		
		} catch (Exception e2)
		{
			System.out.println("Exception Caught By : " +e2);
		}
		
		
	}
}
public class use_jdbc
{

	public static void main(String[] args)
	{
		new Registration_form();

	}

}

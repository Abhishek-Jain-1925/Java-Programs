// Registration Form

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Myfrm1 extends Frame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t5,t6;
	JPasswordField t3,t4;
	JButton b1;
	Random r1,r2;
	
	String s1,s2;
	char ch1,ch2;
	int m,n,n1,n2,i;
	
	Myfrm1()
	{
		super("Login Activity");
		setLayout(null);
		setLocation(500,200);
		setSize(500,500);
		
		l1 = new JLabel("Registration Form");
		l2 = new JLabel("Name :");
		l3 = new JLabel("Login Name :");
		l4 = new JLabel("PassWord :");
		l5 = new JLabel("Confirm PassWord :");
		l6 = new JLabel("Capacha :");
		
		t1 = new JTextField("");
		t2 = new JTextField("");
		t3 = new JPasswordField();
		t4 = new JPasswordField();
		t5 = new JTextField("");
		t6 = new JTextField("");
		
		b1 = new JButton("Submit");
		
		r1 = new Random();
		r2 = new Random();
		n1 = r1.nextInt(10);
		n2 = r2.nextInt(10);
		t5.setText(""+n1+"  +  "+n2+"  =");
		n = n1 + n2;
		
		
		add(l1);	add(l2);	add(l3);	add(l4);	add(l5);	add(l6);
		add(t1);	add(t2);	add(t3);	add(t4);	add(t5);	add(t6);
		add(b1);
		
		
		l1.setBounds(150,50,150,30);
		l2.setBounds(40,100,60,20);
		t1.setBounds(170,100,180,20);
		l3.setBounds(40,130,100,20);
		t2.setBounds(170,130,180,20);
		l4.setBounds(40,160,120,20);
		t3.setBounds(170,160,180,20);
		l5.setBounds(30,190,120,20);
		t4.setBounds(170,190,180,20);
		l6.setBounds(40,220,100,20);
		t5.setBounds(170,220,100,20);
		t6.setBounds(275,220,130,20);
		b1.setBounds(150,270,100,30);
		
		b1.addActionListener(this);

		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try{
		s1 = t3.getText();
		s2 = t4.getText();
		{
			if(s1==null || s1.equals("") || s2==null || s2.equals(""))
			{JOptionPane.showMessageDialog(null,"PassWord Fields Cannot Be Empty");}
	
			if(s1.length() <= 8 || s2.length() <= 8)
			{
			JOptionPane.showMessageDialog(null,"PassWord Contains Min. 8 Char");
			}
		
			for(int i=0; i<s1.length(); i++)
			ch1 = s1.charAt(i);
			ch2 = s2.charAt(i);
			
			if(Character.isUpperCase(ch1) && Character.isUpperCase(ch2))
			//if((!(ch >= 'A' && ch <= 'Z')) )
			{
				JOptionPane.showMessageDialog(null,"Both Password Field Contains Atleast One Small Case Character");
			}
			
			if(Character.isLowerCase(ch1) && Character.isLowerCase(ch2))
			//if((!(ch >= 'a' && ch <= 'z')) )
			{
				JOptionPane.showMessageDialog(null,"Both Password Field Contains Atleast One Upper Case Character");
			}
			
			
			if((!(ch1 >= '!' && ch1 <= '@'))  &&  (!(ch2 >= '!' && ch2 <= '@')) )
			{
				JOptionPane.showMessageDialog(null,"Both Password Field Contains Atleast One Symbol");
			}
			
			m = Integer.parseInt(t6.getText());
			if(m != n)
			{
				JOptionPane.showMessageDialog(null,"Please Enter Valid Capacha");
			}
			
			if(s2.equals(s1))
			{		}
			else
			{	JOptionPane.showMessageDialog(null,"Both Confirm PassWord & Password Field Must be Same..!");	}
	
			/*if(s1.equals(s2) && m==n)
			{
			JOptionPane.showMessageDialog(null,"Registration Successful...!");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t6.setText("");
			}*/
		}
		}catch(Exception as){JOptionPane.showMessageDialog(null,"Please Fill All Proper Arguments...! ");}
	}
}


class login_msg
{
	public static void main(String[] args)
	{
		new Myfrm1();
	}
}
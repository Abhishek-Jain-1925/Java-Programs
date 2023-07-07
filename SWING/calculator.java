//simple Calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myfrm extends Frame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	JLabel l1;
	JTextField t1;
	JSeparator s1;
	int temp,ch;
	
	//String s3,s2;
	
	myfrm()
	{
		super("Calculator");
		setLocation(500,200);
		setSize(300,325);
		setLayout(null);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("+");
		b5 = new JButton("4");
		b6 = new JButton("5");
		b7 = new JButton("6");
		b8 = new JButton("-");
		b9 = new JButton("7");
		b10 = new JButton("8");
		b11 = new JButton("9");
		b12 = new JButton("*");
		b13 = new JButton("0");
		b14 = new JButton("C");
		b15 = new JButton("=");
		b16 = new JButton("/");
		s1 = new JSeparator();
		l1 = new JLabel("Simple Calculator");
		t1 = new JTextField("");
		
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);	add(b6);	add(b7);
		add(b8);	add(b9);	add(b10);	add(b11);	add(b12);	add(b13);	add(b14);
		add(b15);	add(b16);	add(s1);	add(l1);	add(t1);
		
		l1.setBounds(30,30,150,30);
		s1.setBounds(0,65,300,2);
		t1.setBounds(30,75,230,30);
		b1.setBounds(30,115,50,40);
		b2.setBounds(90,115,50,40);
		b3.setBounds(150,115,50,40);
		b4.setBounds(210,115,50,40);
		b5.setBounds(30,165,50,40);
		b6.setBounds(90,165,50,40);
		b7.setBounds(150,165,50,40);
		b8.setBounds(210,165,50,40);
		b9.setBounds(30,215,50,40);
		b10.setBounds(90,215,50,40);
		b11.setBounds(150,215,50,40);
		b12.setBounds(210,215,50,40);
		b13.setBounds(30,265,50,40);
		b14.setBounds(90,265,50,40);
		b15.setBounds(150,265,50,40);
		b16.setBounds(210,265,50,40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
	
		
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
		String s1 = e.getActionCommand();
		t1.setText(t1.getText().concat(s1));
		b4.setActionCommand("");
		b8.setActionCommand("");
		b12.setActionCommand("");
		b16.setActionCommand("");
		b15.setActionCommand("");
		if(e.getSource()==b4)
		{
			String s2 = t1.getText();
			temp = Integer.parseInt(s2);
			t1.setText("");
			ch=1;
		}
		if(e.getSource()==b8)
		{
			String s2 = t1.getText();
			temp = Integer.parseInt(s2);
			t1.setText("");
			ch=2;
		}
		if(e.getSource()==b12)
		{
			String s2 = t1.getText();
			temp = Integer.parseInt(s2);
			t1.setText("");
			ch=3;
		}
		if(e.getSource()==b16)
		{
			String s2 = t1.getText();
			temp = Integer.parseInt(s2);
			t1.setText("");
			ch=4;
		}
		if(e.getSource()==b15)
		{
			switch(ch)
			{
			case 1 :
			{String s3 = t1.getText();
			int a = Integer.parseInt(s3);
			int b = a + temp;
			t1.setText(Integer.toString(b));break;}
			case 2 :
			{String s3 = t1.getText();
			int a = Integer.parseInt(s3);
			int b = temp - a;
			t1.setText(Integer.toString(b));break;}
			case 3 :
			{String s3 = t1.getText();
			int a = Integer.parseInt(s3);
			int b = a * temp;
			t1.setText(Integer.toString(b));break;}
			case 4 :
			{String s3 = t1.getText();
			int a = Integer.parseInt(s3);
			int b = temp / a;
			t1.setText(Integer.toString(b));break;}
			}
		}
		if(e.getSource()==b14)
		{
			t1.setText("");
		}
		}catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(null,"Please Fill Proper Numbers.");
		}
		catch(Exception ee)
		{System.out.println("Exception Caught...!");}
	}
}

class calculator
{
	public static void main(String[] args)
	{
		new myfrm();
	}
}

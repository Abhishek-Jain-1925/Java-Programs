//Unit Converter

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Myfrm3 extends Frame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JComboBox cb1,cb2;
	JButton b1;
	
	float a,b,c;
	
		
	Myfrm3()
	{
		super("Unit Conversion");
		setLocation(500,200);
		setSize(500,250);
		setLayout(null);
		
		l1 = new JLabel("Input");
		l2 = new JLabel("Output");
		l3 = new JLabel("Unit");
		l4 = new JLabel("Unit");
		cb1 = new JComboBox();
		cb2 = new JComboBox();
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Convert");
		
		add(l1);	add(t1);	add(l2);	add(t2);	add(l3);
		add(cb1);	add(cb2);	add(l4);	add(b1);
		cb1.addItem("Feet");	cb1.addItem("Inches");	cb1.addItem("CM");	cb1.addItem("KM");
		cb2.addItem("KM");	cb2.addItem("CM");	cb2.addItem("Inches");	cb2.addItem("Feet");
			
			
		
		l1.setBounds(55,50,50,20);
		t1.setBounds(110,50,130,30);
		l2.setBounds(265,50,50,20);
		t2.setBounds(340,50,130,30);
		
		l3.setBounds(60,90,50,20);
		cb1.setBounds(110,90,130,30);
		l4.setBounds(280,90,50,20);
		cb2.setBounds(340,90,130,30);
		
		b1.setBounds(190,170,120,30);
		
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
		if(e.getSource() == b1)
		{
			a = Float.parseFloat(t1.getText());
			if(cb1.getSelectedIndex()==0 && cb2.getSelectedIndex()==0)
			{
				b= a/3281;
				String s=Float.toString(b);
				t2.setText(s);
			}
			
			if(cb1.getSelectedIndex()==0 && cb2.getSelectedIndex()==1)
			{
				b= a*30;
				String s=Float.toString(b);
				t2.setText(s);
			}
			
			if(cb1.getSelectedIndex()==0 && cb2.getSelectedIndex()==2)
			{
				b= a*12;
				String s=Float.toString(b);
				t2.setText(s);
			}
			
			if(cb1.getSelectedIndex()==0 && cb2.getSelectedIndex()==3)
			{
						t2.setText(t1.getText());
			}
			
			if(cb1.getSelectedIndex()==1 && cb2.getSelectedIndex()==0)
			{
				b= a/39370;
				String s=Float.toString(b);
				t2.setText(s);
			}
			
			if(cb1.getSelectedIndex()==2 && cb2.getSelectedIndex()==0)
			{
				b= a/100000;
				String s=Float.toString(b);
				t2.setText(s);
			}
			
			if(cb1.getSelectedIndex()==3 && cb2.getSelectedIndex()==0)
			{
				t2.setText(t1.getText());
			}
			
			if(cb1.getSelectedIndex()==1 && cb2.getSelectedIndex()==1 && cb1.getSelectedIndex()==2 && cb2.getSelectedIndex()==2)
			{
				b= a*2;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==2 && cb2.getSelectedIndex()==1)
			{
				t2.setText(t1.getText());
			}
			if(cb1.getSelectedIndex()==1 && cb2.getSelectedIndex()==3)
			{
				b= a*12;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==3 && cb2.getSelectedIndex()==3)
			{
				b= a*3281;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==3 && cb2.getSelectedIndex()==1)
			{
				b= a*100000;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==2 && cb2.getSelectedIndex()==2)
			{
				b= a*2;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==2 && cb2.getSelectedIndex()==3)
			{
				b= a*30;
				String s=Float.toString(b);
				t2.setText(s);
			}
			if(cb1.getSelectedIndex()==1 && cb2.getSelectedIndex()==1)
			{
				b= a*2;
				String s=Float.toString(b);
				t2.setText(s);
			}
		}
	
	}
}

class unit_conv
{
	public static void main(String[] args)
	{
		new Myfrm3();
	}
}
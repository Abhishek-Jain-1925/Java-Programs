//Unit Conversions Decimal To OtheR.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Myfrm extends Frame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	int data;
	String bin,oct,hex;
	
	Myfrm()
	{
		super("Unit Conversion Dec.To Other");
		setLocation(500,200);
		setSize(300,300);
		setLayout(null);
		
		l1 = new JLabel("Decimal");
		l2 = new JLabel("Binary");
		l3 = new JLabel("Octal");
		l4 = new JLabel("Hexa-Decimal");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		b1 = new JButton("Calculate");
		b2 = new JButton("Exit");
		
		add(l1);	add(l2);	add(l3);	add(l4);
		add(t1);	add(t2);	add(t3);	add(t4);
		add(b1);	add(b2);
		
		l1.setBounds(50,50,60,30);
		t1.setBounds(140,50,100,30);
		l2.setBounds(50,90,60,30);
		t2.setBounds(140,90,100,30);
		l3.setBounds(50,130,60,30);
		t3.setBounds(140,130,100,30);
		l4.setBounds(30,170,100,30);
		t4.setBounds(140,170,100,30);
		b1.setBounds(30,220,90,30);
		b2.setBounds(130,220,90,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
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
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		if(e.getSource()==b1)
		{
			data= Integer.parseInt(t1.getText());
			bin= Integer.toBinaryString(data);
			oct = Integer.toOctalString(data);
			hex = Integer.toHexString(data);
			
			t2.setText(bin);
			t3.setText(oct);
			t4.setText(hex);
		}
	}
}

class unit_con
{
	public static void main(String[] args)
	{
		new Myfrm();
	}
}
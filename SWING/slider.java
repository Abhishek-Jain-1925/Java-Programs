//Slider in Java using Swing

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class slider1 extends JFrame implements ChangeListener
{
	JSlider sldr;
	JLabel l1;
	
	slider1()
	{
		super("Java Slider");
		setLayout(null);
		setLocation(500,200);
		setSize(500,500);
		//JSlider(start value,end value,initial value)
		sldr = new JSlider(0,500,200);
		sldr.addChangeListener(this);
		
		add(sldr);
		add(l1 = new JLabel(" 200"));
		
		sldr.setBounds(50,50,300,20);
		l1.setBounds(360,50,40,15);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e)
	{
		l1.setText(Integer.toString(sldr.getValue()));
	}
	
}


class slider
{
	public static void main(String[] asdb)
	{
		new slider1();
	}
}
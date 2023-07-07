//Image Handling 2 By JAVA

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Image2 extends JFrame implements ActionListener
{
	Image2()
	{
		setTitle("Image Handling 2");
		setLocation(500,150);
		setSize(500,500);
		setLayout(null);
		
		ImageIcon i1;
		JLabel l1;
		
		i1 = new ImageIcon("truck.jpg");
		l1 = new JLabel(i1);
		
		add(l1);
		
		l1.setBounds(20,20,400,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
}


class img2
{
	public static void main(String[] asdb)
	{
		new Image2();
	}
}



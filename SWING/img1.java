

//Image in Java using Swing

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class image1 extends JFrame
{
	ImageIcon img;
	JLabel l1;
	
	image1()
	{
		super("Image Handling 1");
		//setLayout(null);
		setLocation(500,200);
		setSize(500,500);
		
		img = new ImageIcon("truck.jpg");
		l1 = new JLabel(img);

		add(l1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	

}


class img1
{
	public static void main(String[] asdb)
	{
		new image1();
	}
}
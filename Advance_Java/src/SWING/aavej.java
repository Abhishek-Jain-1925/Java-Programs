package SWING;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



class aavej1 extends JFrame 
{
	aavej1()
	{
		setVisible(true);
		 setSize(600,600);
		 setLocation(400,200);
		 setTitle("img");
		 setLayout(null);
		 setFont(new Font("Tilt Prism", Font.BOLD, 15));
		 JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("Akib.jpg"));
	        add(label);
	        
	        label.setBounds(50, 50, 50, 50);
	}
}


public class aavej 
{
	public static void main(String[] args)
	{
		 new aavej1();
	}

	
}

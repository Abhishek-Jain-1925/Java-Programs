package SWING;

import java.awt.FlowLayout;

import javax.swing.*;

class myfrm extends JFrame
{
	JButton b1;
	JLabel lb1;
	myfrm()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400, 200);
		setTitle("Swing First Program");
		setLayout(new FlowLayout());
		
		b1 = new JButton("Clicked Me");
		lb1 = new JLabel("Welcome");
		
		add(b1);
		add(lb1);
		
		b1.setMnemonic('C');				// Shortcut For Access The Specific Control On keyBoard Using (Alt + "Charcter")
		b1.setToolTipText("This Is Aavej Button");	// To Describe That Specific Control In formation
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// To Close Jframe. Because WindowListener Not Supported For swing
	}
}
public class _1st_prg 
{

	public static void main(String[] args) 
	{
		new myfrm();
	}

}

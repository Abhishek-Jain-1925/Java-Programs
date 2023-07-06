package AWT;

import java.awt.*;
import java.awt.event.*;			// All Listener Comes java.awt.event.* package
class myFrame extends Frame	implements WindowListener		// Frames Are Included In AWT package 
{
	 
	myFrame()
	 {
		 setTitle("My First Frame"); // Or super("My First Frame")  To set The Title Our Frame
		 setSize(500,500); 		// setSize(width,height)
		 setVisible(true);  	//  by default frame is setVisible are false
		 setLocation(400,200);  // setLocation(x,y)
		 addWindowListener(this);	// Activated.    After add WindowListener call windowEvent
	 }
	 
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}


public class _1st_prg
{

	public static void main(String[] args)
	{
		new myFrame();
	}

}



/*
 * all Listener Comes Comes java.awt.event.*; Package
 WindowListener:- 1> Having 7 Methods and Compulsory Should Write All Methods
 				=> @Override
	1.public void windowOpened(WindowEvent e) {}

	@Override
	2.public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	@Override
	3.public void windowClosed(WindowEvent e) {}

	@Override
	4.public void windowIconified(WindowEvent e) {}

	@Override
	5public void windowDeiconified(WindowEvent e) {}

	@Override
	6.public void windowActivated(WindowEvent e) {}

	@Override
	7.public void windowDeactivated(WindowEvent e) {}

 
 2> WindowListener are Interface
 3> Interface Drawback :- comes all derive class methods
 4> In Java All Listener Having The Adapter Classes
 5> and all methods are already derived in that Adapter Classes
 
 
 
 #ActionListener#
 1.Used For Buttons
 2. Having Only One Methods
 	1. actionPerformed(ActionEvent e)
 */

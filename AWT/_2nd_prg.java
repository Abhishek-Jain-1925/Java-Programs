// Adapter Class Demo
package AWT;

import java.awt.*;
import java.awt.event.*;

class myFrame3 extends Frame
{
	myFrame3()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Adapter Class Demo");
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}

public class _2nd_prg 
{

	public static void main(String[] args)
	{
		new myFrame3();

	}

}

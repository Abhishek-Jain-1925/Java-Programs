package AWT;

import java.awt.*;
import java.awt.event.*;

class myfrm11 extends Frame
{
	myfrm11()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new GridLayout(4,5));
		
		setFont(new Font("SansSerif", Font.BOLD, 20));
		
		for(int i=0;i<12;i++)
		{
			add(new Button(""+(i+1)));
		}
		
		addWindowListener(new WindowAdapter() 
		{

			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
}
public class Grid_Layout
{

	public static void main(String[] args)
	{
		new myfrm11();
	}

}

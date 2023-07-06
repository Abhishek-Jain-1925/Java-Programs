package AWT;

import java.awt.Button;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

import java.awt.event.*;
;

class myFrame6 extends Frame
{
	Label l1;
	Button b1;
	myFrame6()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Components And Events");
		
		
		Label l1=new Label("Welcome");
		Button b1=new Button("Click Me");
		
		
		add(b1);
		add(l1);
		
		
		setLayout(new FlowLayout());
		
		
		addWindowListener(new WindowAdapter()
		{

			public void windowClosing(WindowEvent e)
			{
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
	}
}
public class _3rd_prg_copy
{

	public static void main(String[] args)
	{
		new myFrame6();

	}

}

package AWT;

import java.awt.*;
import java.awt.event.*;

class myFrame5 extends Frame
{
	//1 Declaration
	
	Label l1;
	Button b1;
	
	
	myFrame5()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Components And Event");
		
		//2 Memory Allocation
		
		Label l1 = new Label("Welcome");
		Button b1= new Button("Click Me");
		
		
		//3 Add Controls On Frame
		add(b1);
		add(l1);
		
		
		setLayout(new FlowLayout());      // Add This Line Because By Default layout Are Center. So Before Add This Line Controls Allocate Total Size Of Frame
		addWindowListener(new WindowAdapter()
		{

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		
	}
}

public class _3rd_prg
{

	public static void main(String[] args)
	{
		new myFrame5();
	}

}

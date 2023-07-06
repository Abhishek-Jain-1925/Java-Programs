package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm1 extends Frame
{
	Label l1;
	Button b1;
	
	
	myfrm1()
	{
		setVisible(true);
		setLocation(400,200);
		setSize(500,500);
		setTitle("Aavej Frame");
		
		Label l1=new Label("Welocme To Java");
		Button b1=new Button("Click Me");
		
		setLayout(new FlowLayout());
		add(b1);
		add(l1);
		
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
public class _3rd_prg_copy1 
{

	public static void main(String[] args)
	{
		new myfrm1();
	}

}

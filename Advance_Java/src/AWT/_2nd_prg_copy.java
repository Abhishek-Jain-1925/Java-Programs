package AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myFrame4 extends Frame
{
	myFrame4()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Adapter Class Demo 2");
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0 );
			}
			
		});
	}
}
public class _2nd_prg_copy
{

	public static void main(String[] args)
	{
		new myFrame4();
	}

}

package AWT;

import java.awt.*;
import java.awt.event.*;

class myfrm5 extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	int cnt=0;
	myfrm5()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Aavej Frame");
		setLayout(new FlowLayout());
		
		l1=new Label("Welcome");
		b1=new Button("Click");
		
		add(b1);
		add(l1);
		
		b1.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cnt++;
		l1.setText("Aavej" + "c="+cnt);
		
	}
}
public class _4th_prg_copy 
{

	public static void main(String[] args)
	{
		new myfrm5();
	}

}

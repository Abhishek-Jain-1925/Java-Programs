package AWT;

import java.awt.*;
import java.awt.event.*;


class myfrm4 extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	int cnt=0;
	myfrm4()
	{
		setVisible(true);
		setLocation(400,200);
		setSize(500,500);
		setTitle("ActionListener Frame");
		setLayout(new FlowLayout());
		   
		l1=new Label("Welcome");
		b1=new Button("Clicked Me");
		
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
		// TODO Auto-generated method stub
		cnt++;
		l1.setText("count ="+cnt);
	}

	
}
public class _4th_prg 
{

	public static void main(String[] args)
	{
		new myfrm4();
	}

}

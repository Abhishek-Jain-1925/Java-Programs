package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm6 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Button b1,b2;
	TextField t1,t2,t3;
	myfrm6()
	{
		setVisible(true);
		setLocation(400,200);
		setSize(500,500);
		setTitle("Simple Calculator");
		
		setLayout(new FlowLayout());
		
		l1=new Label("Enter 1st No.");
		t1=new TextField();
		
		l2=new Label("Enter 2nd No.");
		t2=new TextField();
		
		l3=new Label("Addition");
		t3=new TextField();
		
		b1=new Button("ADD");
		b2=new Button("CLEAR");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter()
		{

			@Override
			public void windowClosing(WindowEvent e)
			{
				
				System.exit(0);
			}
			
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a+b;
			
			t3.setText(" " +c);
		}
		else
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	}
}

public class _5th_prg
{

	public static void main(String[] args) 
	{
		new myfrm6();
	}

}

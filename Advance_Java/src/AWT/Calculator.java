package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrma extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	myfrma()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Calculator");
		// setLayout(new FlowLayout());
		setLayout(null);
		
		l1=new Label("Enter First No.");
		l2=new Label("Enter second No.");
		l3=new Label("Ans");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		
		
		b1=new Button("ADD");
		b2=new Button("SUB");
		b3=new Button("MUL");
		b4=new Button("DIV");
		b5=new Button("CLR");
		b6=new Button("EXT");
		
		add(l1);	add(t1);	add(l2);	add(t2);	add(l3);	add(t3);
		add(b1);	add(b2);	add(b3);	add(b4);	add(b5);	add(b6);
		
		l1.setBounds(100, 100, 100, 20);
		t1.setBounds(220, 100, 100, 20);
		
		l2.setBounds(100, 140, 100, 20);
		t2.setBounds(220, 140, 100, 20);
		
		l3.setBounds(100, 180, 100, 20);
		t3.setBounds(220, 180, 100, 20);
		
		b1.setBounds(100, 220, 45, 20);
		b2.setBounds(155, 220, 45, 20);
		b3.setBounds(210, 220, 45, 20);
		b4.setBounds(265, 220, 45, 20);
		
		b5.setBounds(100, 250, 100, 20);
		b6.setBounds(220, 250, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource() == b5)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t1.requestFocus();
			}
			else if(e.getSource() == b6)
			{
				System.exit(0);
			}
			
			else
			{
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = 0;
				
				if(e.getSource() == b1)
					c = a+b;
				
				else if(e.getSource() == b2)
					c = a-b;

				else if(e.getSource() == b3)
					c = a*b;
				
				else if(e.getSource() == b4)
					c = a/b;
				
				t3.setText(""+c);
			}	
		}
		
		catch(NumberFormatException e2)
		{
			System.out.println("Exception - Invalid Number");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Exception - Can Not Divide By 0");
		}
		catch(Exception e2)
		{
			System.out.println("Exception Caught "+e2.toString());
		}
		
	}
}
public class Calculator
{

	public static void main(String[] args)
	{
		new myfrma();

	}

}

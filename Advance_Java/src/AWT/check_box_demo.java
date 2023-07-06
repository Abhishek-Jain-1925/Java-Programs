package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm7 extends Frame implements ItemListener
{
	Checkbox cb1,cb2;
	TextField t1;
	
	myfrm7()
	{
		setVisible(true);
		setSize(300,300);
		setLocation(300,200);
		setTitle("CheckBox Demo");
		setLayout(null);
		
		cb1=new Checkbox("Pen");
		cb2=new Checkbox("Pencil");
		t1=new TextField();
		
		add(cb1);
		add(cb2);
		add(t1);
		
		cb1.setBounds(100, 100, 100, 30);
		cb2.setBounds(220, 100, 100, 30);
		t1.setBounds(100, 150, 100, 30);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == cb1)
		{
			if(cb1.getState())
			{
				t1.setText("Pen Checked");
			}
			else
			{
				t1.setText("Pen UnChecked");
			}
		}
		else if(e.getSource() == cb2)
		{
			if(cb2.getState())
			{
				t1.setText("Pencil Checked");
			}
			else
			{
				t1.setText("Pencil UnChecked");
			}
		}
	}
}
public class check_box_demo
{

	public static void main(String[] args)
	{
		new myfrm7();
	}

}

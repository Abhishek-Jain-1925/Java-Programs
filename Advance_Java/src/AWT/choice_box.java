package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm9 extends Frame implements ItemListener
{
	Choice ch;
	TextField t1;
	
	myfrm9()
	{
		setVisible(true);
		setSize(300,300);
		setLocation(400,200);
		setTitle("Choice Box");
		setLayout(null);
		
		ch=new Choice();
		t1=new TextField();
		
		add(ch);
		add(t1);
		
		ch.addItem("Apple");
		ch.addItem("Bat");
		ch.addItem("Cat");
		ch.addItem("Dog");
		
		ch.setBounds(100, 100, 100, 25);
		t1.setBounds(100, 135, 100, 25);
		
		ch.addItemListener(this);
		
		
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
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==ch)
		{
			t1.setText(ch.getSelectedItem());
		}
	}
}
public class choice_box
{

	public static void main(String[] args)
	{
		new myfrm9();
	}

}

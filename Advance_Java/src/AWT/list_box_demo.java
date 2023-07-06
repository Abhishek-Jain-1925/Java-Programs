package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm10 extends Frame implements ItemListener
{
	List lst;
	TextField t1;
	
	myfrm10()
	{
		setVisible(true);
		setSize(300,300);
		setLocation(400,200);
		setTitle("Choice Box");
		setLayout(null);
		
		lst=new List();
		t1=new TextField();
		
		add(lst);
		add(t1);
		
		lst.add("Apple");
		lst.add("Bat");
		lst.add("Cat");
		lst.add("Dog");
		
		lst.setBounds(100, 100, 100, 100);
		t1.setBounds(100, 220, 100, 25);
		
		lst.addItemListener(this);
		
		
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
		if(e.getSource()==lst)
		{
			t1.setText(lst.getSelectedItem());
		}
	}
}
public class list_box_demo
{

	public static void main(String[] args)
	{
		new myfrm10();
	}

}

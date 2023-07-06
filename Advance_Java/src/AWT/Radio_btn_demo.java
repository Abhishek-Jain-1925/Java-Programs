package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myfrm8 extends Frame implements ItemListener
{
	Checkbox ch1,ch2,ch3,ch4;
	TextField t1;
	CheckboxGroup grp1;
	myfrm8()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("Radio Button Demo");
		setLayout(null);
		
		grp1=new CheckboxGroup();
		ch1=new Checkbox("Pen",false,grp1);
		ch2=new Checkbox("Pencil",false,grp1);
		ch3=new Checkbox("Book",false,grp1);
		ch4=new Checkbox("NoteBook",false,grp1);
		
		t1=new TextField("");
		
		
		
		add(ch1);	add(ch2);	add(ch3);	add(ch4);	add(t1);
		
		ch1.setBounds(70, 70, 100, 30);
		ch2.setBounds(180, 70, 100, 30);
		ch3.setBounds(290, 70, 100, 30);
		ch4.setBounds(400, 70, 100, 30);
		t1.setBounds(70, 120, 400, 25);
		
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		ch4.addItemListener(this);
		
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
		if(e.getSource() == ch1)
		{
			t1.setText("Pen Clicked");
		}
		else if(e.getSource() == ch2)
		{
			t1.setText("Pencil Clicked");
		}
		else if(e.getSource() == ch3)
		{
			t1.setText("Book Clicked");
		}
		else if(e.getSource() == ch4)
		{
			t1.setText("NoteBook Clicked");
		}
			
	}
}
public class Radio_btn_demo
{

	public static void main(String[] args)
	{
		new myfrm8();

	}

}

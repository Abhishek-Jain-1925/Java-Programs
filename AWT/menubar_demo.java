package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

class menu_bar extends Frame implements ActionListener
{
	Label l1;
	MenuBar mbr;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	TextField t1;
	Button b1;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup grp1;
	List lst;
	 menu_bar()
	 {
		 setVisible(true);
		 setSize(500,500);
		 setLocation(400,200);
		 setTitle("Menu Bar");
		 setLayout(null);
		 setFont(new Font("Tilt Prism", Font.BOLD, 15));
		 mbr = new MenuBar();
		 
		 m1 = new Menu("File");
		 m2 = new Menu("Colors");
		 m3 = new Menu("Exit");
		 
		 mi1 = new MenuItem("New");
		 mi2 = new MenuItem("Save");
		 mi3 = new MenuItem("Close");
		 mi4 = new MenuItem("Red");
		 mi5 = new MenuItem("Green");
		 mi6 = new MenuItem("Yellow");
		 
		 grp1 = new CheckboxGroup();
		 l1 = new Label("Enter Your Name");
		 t1 = new TextField(" ");
		 b1 = new Button("Clicked Me");
		 ch = new Choice();
		 cb1 = new Checkbox("Pen");
		 cb2 = new Checkbox("Pencil");
		 cb3 = new Checkbox("Book",false,grp1);
		 cb4 = new Checkbox("Note Book",false,grp1);
		 
		 
		 
		 m1.add(mi1);		m2.add(mi4);
		 m1.add(mi2);		m2.add(mi5);
		 m1.add(mi3);		m2.add(mi6);
		 mbr.add(m1);		mbr.add(m2);
		 mbr.add(m3);		add(l1);	add(t1);	 add(b1);	add(ch);	add(cb1);	add(cb2);	add(cb3);	add(cb4);
		 
		 l1.setBounds(50, 50, 140, 30);
		 t1.setBounds(190, 50, 300, 30);
		 b1.setBounds(50, 100, 250, 30);
		 ch.setBounds(320, 100, 170, 30);
		 
		 cb1.setBounds(50, 150, 100, 30);
		 cb2.setBounds(160, 150, 100, 30);
		 cb3.setBounds(50, 200, 100, 30);
		 cb4.setBounds(170, 200, 100, 30);
		 
		 
		 
		 
		 ch.addItem("Apple"); 	ch.addItem("Bat"); 		ch.addItem("Cat");		ch.addItem("Dog");		ch.addItem("Elephant");
		 
		 
		 
		 setMenuBar(mbr);				// To Add Menu Bar On Frame
		 mbr.setFont(new Font("Arial", Font.BOLD,20));
		 
		 m3.addActionListener(this);
		 mi4.addActionListener(this);
		 mi5.addActionListener(this);
		 mi6.addActionListener(this);
		 
		
		 addWindowListener(new WindowAdapter()
		 {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			 
		 });
	 }
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == mi4)
		{
			setBackground(Color.RED);
		}
		else if(e.getSource() == mi5)
		{
			setBackground(Color.GREEN);
		}
		else if(e.getSource() == mi6)
		{
			setBackground(Color.YELLOW);
		}
	}
}
public class menubar_demo
{

	public static void main(String[] args)
	{
		 new menu_bar();
	}

}

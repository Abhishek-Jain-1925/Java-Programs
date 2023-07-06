package SWING;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class menu_bar1 extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JMenuBar mbr;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
	JTextField t1;
	JButton b1,b2,b3;
	JComboBox ch;
	JPasswordField p1;
	List lst;
	JCheckBox cb1,cb2;
	JRadioButton rb1,rb2;
	ButtonGroup grp;
	TextArea ta1;
	JButton[] btn;
	
	JPanel pnl;
	 menu_bar1()
	 {
		 setVisible(true);
		 setSize(600,600);
		 setLocation(400,200);
		 setTitle("Menu Bar");
		 setLayout(null);
		 setFont(new Font("Tilt Prism", Font.BOLD, 15));
		 JLabel label = new JLabel(); //JLabel Creation
	        label.setIcon(new ImageIcon("Akib.jpg"));
		
		 
		 // 2. Memory Allocation
		 mbr = new JMenuBar();
		 
		 m1 = new JMenu("File");
		 m2 = new JMenu("Colors");
		 m3 = new JMenu("Exit");
		 m4 = new JMenu("Messege Box");
		 
		 mi1 = new JMenuItem("New");
		 mi2 = new JMenuItem("Save");
		 mi3 = new JMenuItem("Close");
		 mi4 = new JMenuItem("Red");
		 mi5 = new JMenuItem("Green");
		 mi6 = new JMenuItem("Yellow");
		 mi7 = new JMenuItem("Simple Messege Box");
		 mi8 = new JMenuItem("Warning Messege Box");
		 mi9 = new JMenuItem("Error Messege Box");
		 
		 l1 = new JLabel("Enter Your Name");
		 l2 = new JLabel("Password");
		 t1 = new JTextField();
		 b1 = new JButton("Clicked Me");
		 p1 = new JPasswordField();
		 ch =  new JComboBox();
		 lst = new List();
		 cb1 = new JCheckBox("Pen");
		 cb2 = new JCheckBox("Pencil");
		 
		 grp = new ButtonGroup();
		 rb1 = new JRadioButton("Book");
		 rb2 = new JRadioButton("Note Book");
		 
		 ta1 = new TextArea();
		 
		 pnl = new JPanel();
		 b2 = new JButton("HIDE");
		 b3 = new JButton("SHOW");
		 // Add Controls On Frame
		 m1.add(mi1);		m2.add(mi4);
		 m1.add(mi2);		m2.add(mi5);
		 m1.add(mi3);		m2.add(mi6);
		 m4.add(mi7);		m4.add(mi8);	m4.add(mi9);
		 mbr.add(m1);		mbr.add(m2);
		 mbr.add(m3);		mbr.add(m4);		add(l1);	add(l2);	add(t1);	 add(b1);	add(ch); add(p1);
		 add(lst); 	add(cb1);	add(cb2);	add(rb1);	add(rb2); grp.add(rb1); 	grp.add(rb2); add(ta1); 	add(pnl);
		 add(b2); 	add(b3);
		 
		 // SetBounds Methods
		 l1.setBounds(40, 40, 140, 30);
		 t1.setBounds(190, 40, 350, 30);
		 b1.setBounds(40, 90, 250, 30);
		 l2.setBounds(40, 130, 100, 30);
		 ch.setBounds(300, 90, 240, 30);
		 p1.setBounds(140, 130, 150, 30);
		 lst.setBounds(300, 130, 240, 220);
		 cb1.setBounds(40, 170, 100, 30);
		 cb2.setBounds(160, 170, 100, 30);
		 
		 rb1.setBounds(40, 210, 100, 30);
		 rb2.setBounds(150, 210, 100, 30);
		 
		 ta1.setBounds(40, 250, 245, 100);
		 pnl.setBounds(40, 360, 245, 100);
		 
		 b2.setBounds(300, 360, 240, 50);
		 b3.setBounds(300, 420, 240, 50);
		 
		 
		 ch.addItem("Apple");
		 ch.addItem("Bat");
		 ch.addItem("Cat");
		 ch.addItem("Dog");
		 
		 lst.add("Apple");
		 lst.add("Bat");
		 lst.add("Cat");
		 lst.add("Dog");
		 
		 add(label);
		 setJMenuBar(mbr);
		 
		 mbr.setFont(new Font("Arial", Font.BOLD,20));
		 pnl.setSize(240, 150);
		 pnl.setBackground(Color.DARK_GRAY);
		 btn = new JButton[10];
		 for(int i=0;i<10;i++)
		 {
			 	btn[i]=new JButton(" "+(i+1));
				pnl.add(btn[i]);
		 }
		 
		 // Add Listener
		 m3.addActionListener(this);
		 mi4.addActionListener(this);
		 mi5.addActionListener(this);
		 mi6.addActionListener(this);
		 mi7.addActionListener(this);
		 mi8.addActionListener(this);
		 mi9.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 
		
	 }
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == mi7)
			JOptionPane.showMessageDialog(null, "This is Simple Messege Box");
		if(e.getSource() == mi8)
			JOptionPane.showMessageDialog(null, "Pls Try Again" , "Invalid Password" , JOptionPane.WARNING_MESSAGE);
		if(e.getSource() == mi9)
			JOptionPane.showMessageDialog(null, "Access Denil" , "Invalid Password" , JOptionPane.ERROR_MESSAGE);
			
		if(e.getSource()==b2)
		{
			pnl.setVisible(false)   ;
		}
		else if(e.getSource()==b3)
		{
			pnl.setVisible(true);
		}
	}
}
public class all_swing_controls
{

	public static void main(String[] args)
	{
		 new menu_bar1();
	}

}

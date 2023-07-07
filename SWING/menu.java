//Menu Driven Program

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//For Random Numbers
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Myfrm5 extends Frame implements ActionListener
{
	JMenuBar mbr;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12;
	JSeparator st1;
	JRadioButton rb1,rb2;
	ButtonGroup grp;
	JTextArea t1;
	Random rd;
	String s1;
	int[] a = new int[50];
	int i;
	
	Myfrm5()
	{
		super("Menu Bar");
		setLocation(500,200);
		setSize(500,500);
		setLayout(null);
		
		mbr = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Compute");
		m3 = new JMenu("Operations");
		mi1 = new JMenuItem("Load");
		mi2 = new JMenuItem("Save");
		mi3 = new JMenuItem("Exit");
		mi4 = new JMenuItem("Sum");
		mi5 = new JMenuItem("Average");
		mi6 = new JMenuItem("Maximum");
		mi7 = new JMenuItem("Minimum");
		mi8 = new JMenuItem("Median");
		mi9 = new JMenuItem("Search");
		m4 = new JMenu("Sort");
		grp = new ButtonGroup();
		rb1 = new JRadioButton("Ascending",true);
		rb2 = new JRadioButton("Descending");
		t1 = new JTextArea();
		rd = new Random();
		
		
		m1.add(mi1);	m1.add(mi2);	m1.add(mi3);	mbr.add(m1);	
		m2.add(mi4);	m2.add(mi5);	m2.add(mi6);	m2.add(mi7);	m2.add(mi8);	mbr.add(m2);	
		m3.add(mi9);	m3.add(m4);		m4.add(rb1);	m4.add(rb2);	mbr.add(m3);
		add(mbr);		add(t1);
		grp.add(rb1);	grp.add(rb2);
		
		
		mbr.setBounds(10,20,500,50);
		t1.setBounds(10,80,450,400);
		//t1.setBackground(Color.GRAY);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==mi3)
		{
			System.exit(0);
		}
		if(e.getSource()==mi1)
		{
			for(int i=0; i<50; i++)
				a[i]  = rd.nextInt(99);
			if(a[i]>9)
			for(int i=0; i<50; i++)
			
				//for(int l=0;l<10;l++)
			s1 = Arrays.toString(a);
				System.out.println(s1);
		}
		if(e.getSource()==mi2)
		{
			File file = new File("C:\\Java Programs\\numbers.txt");
			
			boolean result;
			try{
				result = file.createNewFile();
				if(result)
				//{JOptionPane.showMessageDialog(null,"File Created successfully..!");}
					{System.out.println("File Created...! at Location :"+file.getCanonicalPath());}
				else
				{System.out.println("File Exist at Location :"+file.getCanonicalPath());}
			}catch(IOException asd)
			{asd.printStackTrace();}
			
			try{
			FileWriter myWriter = new FileWriter("C:\\Java Programs\\numbers.txt");
			{myWriter.write("");}
			JOptionPane.showMessageDialog(null,"Written Successfully...!");
			myWriter.close();
			}catch(IOException asf){System.out.println("Error Occured.");}
		}
		
		if(e.getSource()==mi4)
		{
		
		}
	}
}

class menu
{
	public static void main(String[] args)
	{
		new Myfrm5();
	}
}
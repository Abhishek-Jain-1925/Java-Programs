

//Any File Browsing in Java using Swing

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Filechoose1 extends JFrame implements ActionListener
{
	
	JTextField t1;
	JButton b1;
	JFileChooser fc;
	
	Filechoose1()
	{
		super("File Choosing within Drive");
		setLayout(new FlowLayout());
		setLocation(500,200);
		setSize(500,500);
	
		t1 = new JTextField(20);
		b1 = new JButton("Browse");
		fc = new JFileChooser();
		
		add(t1);	add(b1);
		
		b1.addActionListener(this);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		fc.setCurrentDirectory(new File("."));
		fc.showOpenDialog(this);
		File f1 = fc.getSelectedFile();
		t1.setText(f1.getPath());
	}

}


class filechoose
{
	public static void main(String[] asdb)
	{
		new Filechoose1();
	}
}
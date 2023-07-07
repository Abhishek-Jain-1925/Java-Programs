

//Any File Browsing in Java using Swing

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class FilechooseRead extends JFrame implements ActionListener
{
	
	JTextField t1;
	JButton b1;
	JFileChooser fc;
	TextArea t2;
	
	FilechooseRead()
	{
		super("File Choosing within Drive");
		setLayout(new FlowLayout());
		setLocation(500,200);
		setSize(500,500);
	
		t1 = new JTextField(20);
		b1 = new JButton("Browse");
		fc = new JFileChooser();
		t2 = new TextArea();
		
		add(t1);	add(b1);	add(t2);
		
		b1.addActionListener(this);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1){
		fc.setCurrentDirectory(new File("."));
		fc.showOpenDialog(this);
		File f1 = fc.getSelectedFile();
		t1.setText(f1.getPath());
		
		try{
			
			int i;
			String temp="";
			FileInputStream fin = new FileInputStream(f1.getPath());
			do{
				i = fin.read();
				
				if(i != -1)
					temp=temp+((char) i);
			}while(i != -1);
			
			fin.close();
			t2.setText(temp);
			
		}catch(Exception e)
		{	}
		}
	}

}


class filechoose2
{
	public static void main(String[] asdb)
	{
		new FilechooseRead();
	}
}
//Image Handling 3 By JAVA

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Image3 extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	ImageIcon i1,i2,i3;
	
	Image3()
	{
		setTitle("Image Handling 3");
		setLocation(500,150);
		setSize(500,500);
		setLayout(null);
		
		i1 = new ImageIcon("b1.png");
		i2 = new ImageIcon("b2.png");
		i3 = new ImageIcon("b3.png");
		b1 = new JButton(i1);
		b2 = new JButton(i2);
		b3 = new JButton(i3);
		b1.setText("Save");
		b2.setText("Update");
		b3.setText("Exit");
		
		b1.setToolTipText("Save");
		b2.setToolTipText("Update");
		b3.setToolTipText("Exit");
		
		add(b1);	add(b2);	add(b3);
		
		b1.setBounds(50,50,100,40);
		b2.setBounds(160,50,100,40);
		b3.setBounds(270,50,100,40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,ae.getActionCommand() +"  Clicked.","Clicked Event Announcing",JOptionPane.WARNING_MESSAGE);
	}
}


class img3
{
	public static void main(String[] asdb)
	{
		new Image3();
	}
}





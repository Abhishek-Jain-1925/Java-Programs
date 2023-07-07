import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Myfrm6 extends JFrame implements ActionListener
{
	JToolBar bar;
	JButton b1,b2,b3;
	
	Myfrm6()
	{
		super("JTool Bar");
		setLocation(500,200);
		//setLayout(null);
		setSize(500,500);
		
		bar = new JToolBar();
		b1 = new JButton("Windows 7");
		b2 = new JButton("Windows 8");
		b3 = new JButton("Windows 9");
		
		bar.add(b1);	bar.addSeparator();
		bar.add(b2);	bar.addSeparator();
		bar.add(b3);
		
		add(bar,BorderLayout.NORTH);
		bar.setFloatable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,e.getActionCommand() + " Clicked");
	}
}


class toolbar
{
	public static void main(String[] args)
	{
	new Myfrm6();
	}
}

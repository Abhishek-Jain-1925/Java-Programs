package SWING;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

class Jtool_bar_demo extends JFrame implements ActionListener
{
	JToolBar tb1;
	JButton jb1,jb2,jb3;
	
	Jtool_bar_demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400, 200);
		setTitle("Tool Bar Demo");
		
		tb1 = new JToolBar();
		jb1 = new JButton("Windows 8");
		jb2 = new JButton("Windows 9");
		jb3 = new JButton("Windows 10");
		
		
		tb1.add(jb1);
		tb1.addSeparator();
		tb1.add(jb2);
		tb1.addSeparator();
		tb1.add(jb3);
		
		add(tb1,BorderLayout.NORTH);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
			JOptionPane.showMessageDialog(null, e.getActionCommand() + " Opened");	
	}
}
public class Jtool_bar
{

	public static void main(String[] args)
	{
		new Jtool_bar_demo();
	}

}

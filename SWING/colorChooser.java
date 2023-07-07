//Color Chooser in Java
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class clorchoose extends JFrame implements ChangeListener
{
	JColorChooser cc;
	JLabel l1;
	
	clorchoose()
	{
		super("Color Chooser");
		setLayout(null);
		setLocation(500,100);
		setSize(650,500);
		
		l1 = new JLabel("Wel-Come To Balambika Transport",JLabel.CENTER);
		l1.setForeground(Color.WHITE);
		l1.setBackground(Color.BLACK);
		l1.setOpaque(true);
		l1.setFont(new Font("Arial",Font.BOLD,25));
		//l1.setBorder(BorderFactory.createTitledBorder("Display"));
		l1.setBorder(BorderFactory.createLineBorder(Color.GREEN,20));
		
		cc = new JColorChooser(l1.getForeground());
		cc.getSelectionModel().addChangeListener(this);
		cc.setBorder(BorderFactory.createTitledBorder("Choose Your Color"));
		
		add(l1);	add(cc);
		
		l1.setBounds(15,15,500,80);
		cc.setBounds(15,105,500,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public void stateChanged(ChangeEvent ce)
	{
		Color clr = cc.getColor();
		l1.setForeground(clr);
	}
}

class colorChooser
{
	public static void main(String[] asdb)
	{
		new clorchoose();
	}
}
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class diesel_payment_find1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	SimpleDateFormat formatter;
	Date date;
	
	diesel_payment_find1()
	{
		super("Diesel/Petrol Payment Calculator");
		setLayout(null);
		setLocation(500,150);
		setSize(500,350);
		
		l1 = new JLabel("Enter Total KM : ");
		t1 = new JTextField();
		l2 = new JLabel("Enter Fuel Rate : ");
		t2 = new JTextField();
		l3 = new JLabel("Enter Average of Your Vehicle : ");
		t3 = new JTextField();
		b1 = new JButton(" Calculate ");
		b2 = new JButton(" CLR ");
		l4 = new JLabel("Total Cost For Fuel : ");
		t4 = new JTextField();
		l5 = new JLabel();
		
		add(l1);	add(l2);	add(l3);	add(l4);	add(t1);
		add(t4);	add(t2);	add(t3);	add(b1);	add(b2);
		add(l5);
		
		l1.setBounds(40,40,120,30);
		t1.setBounds(250,40,120,30);
		l2.setBounds(40,80,120,30);
		t2.setBounds(250,80,120,30);
		l3.setBounds(40,120,180,30);
		t3.setBounds(250,120,120,30);
		b1.setBounds(40,160,280,30);
		b2.setBounds(325,160,100,30);
		l4.setBounds(40,230,140,30);
		t4.setBounds(180,230,180,30);
		l5.setBounds(370,230,120,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		date = new Date();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			double km = Double.parseDouble(t1.getText());
			double drate = Double.parseDouble(t2.getText());
			double avg = Double.parseDouble(t3.getText());
			
			double cost = (km/avg)*drate;
			String Cost = Double.toString(cost);
			t4.setText("Rs. "+Cost+" /-");
			l5.setText("As On "+formatter.format(date));
		}
		if(e.getSource() == b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
	}
}


class diesel_payment_finder
{
	public static void main(String[] args)
	{
		new diesel_payment_find1();
	}
}
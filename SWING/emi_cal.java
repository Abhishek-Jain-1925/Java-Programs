import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

class emi extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	double p,r,n;
	double emi=0;
	
	emi()
	{
		super("EMI Calculator");
		setLayout(null);
		setLocation(500,150);
		setSize(500,400);
		
		l1 = new JLabel("Loan Amount :");
		l2 = new JLabel("Interest Rate(%) :");
		l3 = new JLabel("Duration (In Months) :");
		l4 = new JLabel("Your EMI :");
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
		b1 = new JButton("Calculate EMI");
		b2 = new JButton("Exit");
		
		add(l1);	add(l2);	add(l3);	add(l4);
		add(t1);	add(t2);	add(t3);	add(t4);
		add(b1);	add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		l1.setBounds(50,50,100,25);
		t1.setBounds(190,50,150,25);
		l2.setBounds(50,100,100,25);
		t2.setBounds(190,100,150,25);
		l3.setBounds(50,150,130,25);
		t3.setBounds(190,150,150,25);
		b1.setBounds(40,200,300,30);
		l4.setBounds(70,240,100,25);
		t4.setBounds(190,240,150,25);
		b2.setBounds(40,280,300,30);
		
		t1.requestFocus();
		//t4.setEnabled(false);
		//t4.setBackground(Color.GRAY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			p = Double.parseDouble(t1.getText());
			r = Double.parseDouble(t2.getText());
			n = Double.parseDouble(t3.getText());
			emi = (p*r*Math.pow((1+r),n)/(Math.pow((1+r),n)-1));
			//emi = p*r*n;
			//(1+r)^n
			
			t4.setText(Double.toString(emi));
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}
}

class emi_cal
{
	public static void main(String[] asdb)
	{
		new emi();
	}
}
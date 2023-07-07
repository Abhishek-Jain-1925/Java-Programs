import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Bank1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	Connection cn;
	Statement smt;
	PreparedStatement prstm;
	int acNo;
	String sql,name,cre;
	double amt;
	
	Bank1()
	{
		super(" Banking System ");
		setLocation(500,150);
		setLayout(null);
		setSize(450,450);
		
		l1 = new JLabel("Welcome To Balambika Multi-State.");
		l2 = new JLabel("Enter Account No. : ");
		t1 = new JTextField();
		l3 = new JLabel("Enter Ac. Holder Name : ");
		t2 = new JTextField();
		l4 = new JLabel("Enter Amount : ");
		t3 = new JTextField();
		b1 = new JButton("Create Account");
		b2 = new JButton("Add Amount");
		b3 = new JButton("Withdraw Amount");
		b4 = new JButton(" Clear ");
		b5 = new JButton(" Exit ");
		l5 = new JLabel("Thank You for Banking With Balambika Group...!");
		
		add(l1); add(l2);	add(l3);	add(l4);	add(l5);
		add(t1); add(t2);	add(t3);
		add(b1); add(b2);	add(b3);	add(b4);	add(b5);
		
		l1.setBounds(100,40,440,20);
		l2.setBounds(40,80,120,30);
		t1.setBounds(200,80,160,30);
		l3.setBounds(40,120,150,30);
		t2.setBounds(200,120,160,30);
		l4.setBounds(40,160,120,30);
		t3.setBounds(200,160,160,30);
		b1.setBounds(40,210,320,30);
		b2.setBounds(40,250,120,30);
		b3.setBounds(170,250,170,30);
		b4.setBounds(40,290,120,30);
		b5.setBounds(170,290,170,30);
		l5.setBounds(40,350,440,20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		try{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		}
		catch(Exception ee)
		{
			JOptionPane.showMessageDialog(null,""+ee);
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b4)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(e.getSource() == b5)
		{
			System.exit(0);
		}
		try{
		if(e.getSource() == b1)
		{
			acNo = Integer.parseInt(t1.getText());
			name = t2.getText();
			amt = Double.parseDouble(t3.getText());
									
			sql = "insert into bank values("+acNo+",' "+name+" ',"+amt+")";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Account Created SuccessFully with Name :"+name);
		}
		if(e.getSource() == b2)
		{	
			acNo = Integer.parseInt(t1.getText());
			name = t2.getText();
			amt = Double.parseDouble(t3.getText());
			
			sql = "update bank set bal="+amt+" where acNo="+acNo+"";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,amt+" Amount SuccessFully Creadited");
		}
		if(e.getSource() == b3)
		{
			acNo = Integer.parseInt(t1.getText());
			name = t2.getText();
			amt = Double.parseDouble(t3.getText());
			
		}
		}
		catch(Exception eee)
		{
			JOptionPane.showMessageDialog(null,eee);
		}
	}
}

class bank
{
	public static void main(String[] args)
	{
		new Bank1();
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class LandATM extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
	Connection cn;
	
			
	LandATM()
	{
		super("Home ATM");
		setLocation(500,150);
		setSize(500,350);
		setLayout(null);
		
		try{
			
		}catch(Exception ee)
		{}
				
		l1 = new JLabel("WelCome To National Bank");
		l2 = new JLabel("Enter Your Account No : ");
		t1 = new JTextField();
		l3 = new JLabel("Enter PIN : ");
		t2 = new JTextField();
		b1 = new JButton(" Proceed ");
		b2 = new JButton(" Exit ");
		
		add(l1);	add(l2);	add(l3);	add(t1);	add(t2);
		add(b1);	add(b2);
		
		l1.setBounds(60,40,400,35);
		l2.setBounds(40,100,150,30);
		t1.setBounds(220,100,150,30);
		l3.setBounds(40,140,150,30);
		t2.setBounds(220,140,150,30);
		b1.setBounds(70,200,100,40);
		b2.setBounds(220,200,100,40);
		l1.setFont(new Font("Serif",Font.BOLD,30));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			new HomeATM();	
			//setVisible(false);
			dispose();
		}
		if(ae.getSource()== b2)
		{
			System.exit(0);
		}
	}
}

class HomeATM extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	int acNO=0;
	double amt=0.0,bal=0.0;
	String sql;
	Connection cn;
	Statement stm;
	PreparedStatement prstm;
	
	HomeATM()
	{
		super("Home of ATM");
		setLocation(500,150);
		setSize(380,350);
		setLayout(null);
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
		l1 = new JLabel("Enter Amount : ");
		t1 = new JTextField();
		l2 = new JLabel("Select Your Transaction - ");
		b1 = new JButton(" Deposit ");
		b2 = new JButton(" Withdraw ");
		b3 = new JButton(" Check Balance ");
		b4 = new JButton(" Exit ");
		
		add(l1);	add(t1);	add(l2);	add(b1);	add(b2);
		add(b3);	add(b4);
		
		l1.setBounds(50,50,100,30);
		t1.setBounds(140,50,130,25);
		l2.setBounds(50,100,150,40);
		b1.setBounds(50,150,100,30);
		b2.setBounds(170,150,100,30);
		b3.setBounds(50,190,220,30);
		b4.setBounds(50,230,220,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b4)
		{
			System.exit(0);
		}
		try{
		//for Insert into Database.
		if(e.getSource()==b1)
		{
			
			//sql = "insert into atm values("+acNo+","+amt+")";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,amt+"/- SuccessFully Deposited..!!!");
		}
		
		//for Update into database
		if(e.getSource()==b2)
		{
			sql = "update atm set amt='"+amt+"' where acNo="+acNO;
			//sql = "update mytable set name=' " +name+ " ',age="+age+" where roll="+roll+"";
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,amt+"/- Withdraw SuccessFully..!!! Remaining Balance="+bal);
		}
		if(e.getSource()==b4)
		{
			//sql = "select amt from atm where acNO="+acNo;
			prstm = cn.prepareStatement(sql);
			prstm.execute();
			prstm.close();
			JOptionPane.showMessageDialog(null,"Record SuccessFully Deleted..!!!");
		}
	}catch(NumberFormatException nfe)
	{JOptionPane.showMessageDialog(null,"Fields Cannot be Empty","Invalid Filled of Info",JOptionPane.ERROR_MESSAGE);}
	catch(Exception ae)
	{System.out.println(ae);}
	}
	}


class ATM
{
	public static void main(String args[])
	{
		new LandATM();
	}
}
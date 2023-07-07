//Jtable Billing Sytem by using Database.
import javax.swing.*;
import javax.swing.table.*;
import java.lang.Object;
import java.awt.event.*;
//import java.sql.*;

class billSystem extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	JTable tbl;
	JScrollPane jsp;
	Double Total=0.0,bill=0.0;
	DefaultTableModel dtm;
	
	Object colHeads[] = {"Item ID","Item Name","Item Prize"};
	Object data[] = {"","Total Bill :",Double.toString(bill)};
	Object[] row = new Object[3];
	
	billSystem()
	{
		super("Billing System Using JTABLE");
		setLayout(null);
		setLocation(700,100);
		setSize(400,570);
		
		l1 = new JLabel("Item ID :");
		l2 = new JLabel("Item Name :");
		l3 = new JLabel("Item Prize :");
		l4 = new JLabel("Your Grand Total :");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		b1 = new JButton("Add To Bill");
		b2 = new JButton("Delete");
		b3 = new JButton("Exit");
		
		dtm = new DefaultTableModel();
		tbl = new JTable();
		dtm.setColumnIdentifiers(colHeads);
		tbl.setModel(dtm);
		//tbl.setEnabled(false);
				
		add(l1);	add(l2);	add(l3);	add(t1);	add(t2);	add(t3);	add(l4);	add(t4);
		add(b1);	add(b2);	add(b3);	add(tbl);
		
		l1.setBounds(20,20,80,20);
		t1.setBounds(110,20,100,20);
		l2.setBounds(20,50,80,20);
		t2.setBounds(110,50,100,20);
		l3.setBounds(20,80,80,20);
		t3.setBounds(110,80,100,20);
		l4.setBounds(20,490,110,35);
		t4.setBounds(135,495,120,25);
		b1.setBounds(20,120,120,20);
		b2.setBounds(150,120,80,20);
		b3.setBounds(240,120,80,20);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		jsp = new JScrollPane(tbl,v,h);
		add(jsp);
		
		jsp.setBounds(20,150,350,330);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b3)
		{
			System.exit(0);
		}
		if(e.getSource() == b2)
		{
			int i = tbl.getSelectedRow();
			if(i>=1)
				dtm.removeRow(i);
			else
				System.out.println("Delete Error..!!!");
		}
		
		
		//For Adding Item To Bill Desk.
		if(e.getSource() == b1)
		{
			row[0]=(t1.getText());
			row[1] = t2.getText();
			bill = Double.parseDouble(t3.getText());
			Total = Total + bill;
			row[2] = (t3.getText());
			
			dtm.addRow(row);
			t4.setText("Rs. "+Double.toString(Total));
			
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			
		}
	}
}

class JTableBillingSystem
{
	public static void main(String[] args)
	{
		new billSystem();
	}
}



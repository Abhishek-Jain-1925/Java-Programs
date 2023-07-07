//JTable Using Java
import javax.swing.*;

class JTableDemo extends JFrame
{
	JTable tb1;
	
	JTableDemo()
	{
		super("JTable");
		//setLayout(null);
		setLocation(500,150);
		setSize(400,400);
		
		String colHeads[] = { " Name " , "Phone No. " , " Address " };
		String data[][]= 
		{
			{" Abhi", "9595601925" , "Balamtakali" },
			{" Papa", "9552901925" , "Bodhegaon" },
			{" MOMMY", "9309134525" , "Jayakawadi" },
			{" Aavi", "9623096946" , "Baramati" },
			{" Bhaya", "9552404545" , "Gajobhavi" },
			{" Anni", "9011868686" , "MuMbai" },
			{" UTTU", "8668458595" , "BMT" },
			{" Kedar", "8686265689" , "PUNE" }
		};
		
		tb1 = new JTable(data,colHeads);
		add(tb1);
		tb1.setEnabled(false);//for stop data changing in table by user.
		
		//tb1.setBounds(0,50,400,150);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(tb1,v,h);
		add(jsp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class jtable
{
	public static void main(String[] asdb)
	{
		new JTableDemo();
	}
}



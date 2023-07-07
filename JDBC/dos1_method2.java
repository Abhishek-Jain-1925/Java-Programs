//Get Info From Result-Set

import java.sql.*;

class dos1_method2
{
	public static void main(String[] asdb)
	{
		int cnt=0;
		Connection cn;
		Statement stm;
		ResultSet rs;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
			stm = cn.createStatement();
			
			rs = stm.executeQuery("select * from mytable");
			while(rs.next())
			{
				//Changes are Here,Access Data By its Column Name-->
				System.out.println("\t" +rs.getString("roll")+ "\t");
				System.out.println( rs.getString("name")+ "\t");
				System.out.println(rs.getString("age"));
				cnt++;
			}
			
			rs.close();
			
			System.out.println("\n\t *** Total No. of Records :" +cnt+ "  ***");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}



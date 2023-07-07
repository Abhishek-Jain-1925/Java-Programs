//Get Info From Result-Set

import java.sql.*;

class dos1
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
				System.out.println("\t" +rs.getString(1)+ "\t");
				System.out.println( rs.getString(2)+ "\t");
				System.out.println(rs.getString(3));
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



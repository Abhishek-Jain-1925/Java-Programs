package Jdbc_prg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _3rd_prg
{

	public static void main(String[] args)
	{
		Connection cn;
		Statement st;
		ResultSet rs;
		
		try
		{
			 cn = DriverManager.getConnection("jdbc:mysql:///aavej","root","");
			 st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 rs = st.executeQuery("Select * From student order by Roll_No");
			 while(rs.next())
				{
					
					System.out.print("\n\t"+rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3));
				}
			 
			 System.out.println("\n\n Operation On ResultSet");
			 // update the 2nd row
			 rs.absolute(2);		// Move On Second Row
			 rs.updateString(2, "Aaditya");
			 rs.updateInt(3, 25);
			 rs.updateRow();
			 
			 
			 // Deleting Row In a Table
			 
			 rs.absolute(3);
			 rs.deleteRow();
			 
			 //Inserting Row In a Table
			 
			 rs.moveToInsertRow();
			 rs.updateInt(1, 103);
			 rs.updateString(2, "Krushna");
			 rs.updateInt(3, 22);
			 rs.insertRow();
			 
			 rs.beforeFirst();
			 while(rs.next())
				{
					
					System.out.print("\n\t"+rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3));
				}
		}
		catch (Exception e)
		{
			System.out.println("Exception Caught By : "+e);
		}
		
	}

}

package Jdbc_prg;

import java.sql.*;
public class _2nd_prg_copy 
{

	public static void main(String[] args)
	{
		int cnt=0;
		Connection cn;
		Statement s;
		ResultSet rs;
		
		try 
		{
			cn = DriverManager.getConnection("jdbc:mysql:///aavej","root","");
			s = cn.createStatement();
			rs = s.executeQuery("Select * From student");
			while(rs.next())
			{
				System.out.print("\n\t"+rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3));
			}
			rs.close();
			System.out.println("\n\nTotal Number Of Records = " +cnt);
			
		} catch (Exception e) 
		{
			System.out.println("Exception Caught By " +e);
		}
	}

}

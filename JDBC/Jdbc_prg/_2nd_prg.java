   package Jdbc_prg;

import java.sql.*;


public class _2nd_prg
{

	public static void main(String[] args)
	{
		int cnt=0; 
		Connection cn;
		Statement stm;
		ResultSet rs;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///aavej","root","");
			stm = cn.createStatement();
			rs = stm.executeQuery("Select * from student");
			System.out.println("Student Table Information");
			while(rs.next())
			{
				
				System.out.print("\n\t"+rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3));
				cnt++;
			}
			
		} catch (Exception e) {
			System.out.println(" Exception Caught By = " +e);
		}
	}

}

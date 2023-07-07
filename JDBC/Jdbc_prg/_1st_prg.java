package Jdbc_prg;

import java.sql.*;
import java.util.Scanner;

public class _1st_prg 
{

	public static void main(String[] args)
	{
		
		try 
		{
			int Roll_No,age;
			String Name;
			
			Scanner sc= new Scanner(System.in);
			
			Connection cn;
			PreparedStatement pstm;
			String sql;
			
			cn = DriverManager.getConnection("jdbc:mysql:///aavej","root" ,"");
			
			System.out.println("Enter Roll Number");
			Roll_No=sc.nextInt();
			System.out.println("Enter Name");
			Name=sc.next();
			System.out.println("Enter Age");
			age=sc.nextInt();
			
			sql = "insert into student values(" +Roll_No+ ", '" +Name+ "', "+age+")";
			
			pstm = cn.prepareStatement(sql);
			pstm.execute();
			pstm.close();
			System.out.println("Record Succesfully Insert");
			
		} catch (Exception e)
		{
			System.out.println("Exception Caught By " +e);
		}
		
	}

}


//Resultset Meta Data

import java.sql.*;
import java.io.*;

class ResultsetMetaData
{
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;
		Statement stm ;
		
		con = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		stm = con.createStatement();
		rs = stm.executeQuery("select * from mytable");
		
		rsmd = rs.getMetaData();
		int numcol = rsmd.getColumnCount();
		System.out.println("Number Of Columns : "+numcol);
		
		for(int i=0;i<=numcol;i++)
		{
			System.out.println("\n Column No. : "+i);
			System.out.println("Column Name : "+ rsmd.getColumnName(i));
			System.out.println("Column Type : "+ rsmd.getColumnTypeName(i));
			System.out.println("Column Display Size : "+ rsmd.getColumnDisplaySize(i));
		}
		con.close();
	}
}

 
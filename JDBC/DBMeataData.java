//DataBase MetaData

import java.sql.*;
import java.io.*;

class DBMeataData
{
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		ResultSet rs = null;
		
		con = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println("\n\tDatabase Product Name : "+dbmd.getDatabaseProductName());
		System.out.println("\n\tUserName : "+dbmd.getUserName());
		System.out.println("\n\tDatabase Driver Name : "+dbmd.getDriverName());
		System.out.println("\n\tDatabase Driver Version : "+dbmd.getDriverVersion());
		System.out.println("\n\tDriver Version : "+ dbmd.getDriverMajorVersion());
		
		//Get Procedures Presents in Our Database
		ResultSet rs1 = dbmd.getProcedures(null,null,null);
		//getProcedures(String catalog,String schemaPattern,String procedureNamePattern)
		
		while(rs1.next())
		{
			System.out.println("\n\t"+rs1.getString(1));
		}
		
		//getTables(String catalog,String schemaPattern,String procedureNamePattern,String[] types)
		rs = dbmd.getTables(null,null,null,new String[]{"TABLE"});
		
		System.out.println("\n\t ****  List Of Tables  ****");
		while(rs.next())
		{
			String tblName = rs.getString("TABLE_NAME");
			System.out.println("\n\tTable : "+tblName);
		}
		con.close();
	}
}



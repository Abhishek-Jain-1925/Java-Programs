//ResultSet Concor Updatable and Scrollable
//the property of type_scroll_sensitive and concor_updatable is imp as it changes records in database as changed in ResultSet

import java.sql.*;

class dos2
{
	public static void main(String asdb[])
	{
		try
		{
		int cnt=0;
		Connection cn;
		Statement stm;
		ResultSet rs;
		
		cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 rs = stm.executeQuery("select * from mytable order by roll");
		 
		 while(rs.next())
		 {
			 System.out.println("\n\t"+rs.getString("roll") +" \t");
			 System.out.println(rs.getString("name")+" \t");
			 System.out.println(rs.getString("age"));
			 cnt++;
		 }
		 
		 System.out.println(" **** Updated Operations On Resultset ***");
		 
		 //Update 2nd Row from Table
		 
		 rs.absolute(2); 		//move to 2nd row
		 rs.updateString(2,"xyz");		//updates name of 2nd row
		 rs.updateInt(3,55);	//updates age of 3rd Row
		 rs.updateRow();
		 
		 //Dalete from table
		 rs.absolute(4);		//move to 4th row
		 rs.deleteRow();

		//Insert into table
		rs.moveToInsertRow();	//move to end
		rs.updateInt(1,77);
		rs.updateString(2,"Sam");
		rs.updateInt(3,77);
		rs.insertRow();
		 
		 //getting Updated Data from ResultSet
		 rs.beforeFirst();
		  while(rs.next())
		 {
			 System.out.println("\n\t"+rs.getString("roll") +" \t");
			 System.out.println(rs.getString("name")+" \t");
			 System.out.println(rs.getString("age"));
			 cnt++;
		 }
		 
		 rs.close();
		 //System.out.println("\n\t ***  Total No. of Records : "+cnt);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}

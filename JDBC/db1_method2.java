import java.io.*;
import java.sql.*;

class db1_method2
{
	public static void main(String[] args)
	{
		try{
			
		String name;
		int roll,age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Connection cn;
		PreparedStatement prstm;
		String sql;
		
		cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/abhi","root","");
		//cn= DriverManager.getConnection("jdbc:mysql:///abhi","root","");
		
		System.out.println("\n\t Enter the Roll No. :");
		roll = Integer.parseInt(br.readLine());
		System.out.println("\n\t Enter Your Name :");
		name = br.readLine();
		System.out.println("\n\t Enter Your Age :");
		age = Integer.parseInt(br.readLine());
		
		sql = "insert into mytable values(?,?,?)";
		
		prstm = cn.prepareStatement(sql);
		
		//Changes Are Here-->
		prstm.setInt(1,roll);
		prstm.setString(2,name);
		prstm.setInt(3,age);
		
		prstm.execute();
		prstm.close();
		System.out.println("\n\t Record Successfully Inserted...!");
		
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}


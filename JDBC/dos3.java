import java.io.*;
import java.sql.*;
import java.util.*;

class dos3
{
	public static void main(String[] args)
	{
		Connection cn;
		Statement stm;
		PreparedStatement prstm;
		ResultSet rs;
		int roll,age,ch;
		String sql,name;
		Scanner s;
		
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql:///abhi","root","");
			stm = cn.createStatement();
			
			s = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("\n\t **** My Menu ****");
				System.out.println("\n\t 1.Display");
				System.out.println("\n\t 2.Insert ");
				System.out.println("\n\t 3.Update");
				System.out.println("\n\t 4.Delete");
				System.out.println("\n\t 5.Search");
				System.out.println("\n\t 6.Exit");
				System.out.println("\n\t Enter Your Choice :");
				ch = s.nextInt();
				
				if(ch==6)
				{
					System.exit(0);
				}
				
				switch(ch)
				{
					case 1:
					int cnt=0;
					rs = stm.executeQuery("select * from mytable");
					while(rs.next())
					{
						System.out.println("\n\t"+rs.getString("roll")+"\t");
						System.out.println("\t"+rs.getString("name")+"\t");
						System.out.println("\t"+rs.getString("age"));
						cnt++;
					}
					rs.close();
					System.out.println("\n\t Total No.of Records : "+cnt);
					
					break;
					
					case 2:
					System.out.println("\n\t Enter The Roll No, Name & Age :");
					roll = s.nextInt();
					name = s.next();
					age = s.nextInt();
					
					sql = "insert into mytable values(" +roll+ ",' " +name+ " ',"+age+")";
					prstm = cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t *** Record Successfully Inserted..!!!");
					break;
					
					case 3:
					System.out.println("\n\t Enter Roll No.to Update :");
					roll = s.nextInt();
					System.out.println("\n\t Enter New Name & New Age To set :");
					name = s.next();
					age = s.nextInt();
					
					sql = "update mytable set name=' " +name+ " ',age="+age+" where roll="+roll+"";
					prstm = cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t **** Record Successfully Updated..!!!");
					break;
					
					case 4:
					System.out.println("\n\t Enter Roll Number To Delete The Record :");
					roll = s.nextInt();
					sql = "delete from mytable where roll="+roll+"";
					prstm= cn.prepareStatement(sql);
					prstm.execute();
					prstm.close();
					System.out.println("\n\t **** Record Successfully Deleted...!!!!");
					break;
					
					case 5:
					try{
					System.out.println("\n\t Enter Roll No. To Search :");
					roll = s.nextInt();
					
					rs = stm.executeQuery("select * from mytable where roll="+roll);
					rs.first();
					System.out.println("\n\t Roll No.= "+rs.getString(1)+"\t Name= "+rs.getString(2)+"\t Age = "+rs.getString(3));
					rs.close();
					}//end of Internal try block
					catch(Exception e)
					{
						System.out.println("Student Not Found ... !!!");
					}
				}//End Of Switch
			}//End of While
			
		}//End of Try
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}//End of main
}//End of class


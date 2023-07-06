package Abstract;

import java.util.*;

abstract class staff1
{
	protected int id;
	protected String name;
	
	staff1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	abstract void display();
}

class officeStaff extends staff1
{
	String department;
	officeStaff(int id, String name,String department)
	{
		super(id, name);
		this.department=department;
	}

	
	void display()
	{
		System.out.println("id= "+id);
		System.out.println("name= "+name);
		System.out.println("deparment="+department);
		
	}
	
}

public class staff
{

	public static void main(String[] args)
	{
		int id,n,i;
		String name;
		String department;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of record");
		n=sc.nextInt();
		officeStaff s[]=new officeStaff[n];
		for(i=0;i<n;i++)
		{
		System.out.println("Enter id,name,department");
		id=sc.nextInt();
		name=sc.next();
		department=sc.next();

		s[i]=new officeStaff(id,name,department);
		}
		for(i=0;i<n;i++)
		{
			s[i].display();
		}

	}

}

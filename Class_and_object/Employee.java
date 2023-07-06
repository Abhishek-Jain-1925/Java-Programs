package Class_and_object;

import java.util.Scanner;

class Employee1
{
	int Eid;
	String EName,EDesignation;
	double Esalary;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter E_Id");
		Eid=sc.nextInt();
		System.out.println("Enter E_Name");
		EName=sc.next();
		System.out.println("E_Designation");
		EDesignation=sc.next();
		System.out.println("Enter E_Salary");
		Esalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("E_ID= "+Eid);
		System.out.println("E_Name= "+EName);
		System.out.println("E_Designation= "+EDesignation);
		System.out.println("E_Salary= "+Esalary);
	}
}
public class Employee 
{
	public static void main(String[] args) 
	{
		Employee1 EMP=new Employee1();
		EMP.accept();
		EMP.display();
	}
}

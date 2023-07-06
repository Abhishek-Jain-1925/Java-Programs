package My_own_program;

/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
 Ask user for their salary and year of service and print the net bonus amount.*/

import java.util.*;
public class Emp_Discount {

	public static void main(String[] args) 
	{
		int salary,net_bonus,year_ex,total_sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Salary");
		salary=sc.nextInt();
		System.out.println("Enter Your Experience Service");
		year_ex=sc.nextInt();
		net_bonus=salary*5/100;
		total_sal=net_bonus+salary;
		if(year_ex>=5)
		{
			System.out.println("Bounse Amount=" +net_bonus);
			System.out.println("Total Salary=" +total_sal);	
		}
		else
		{
			System.out.println("No Bonus Because Your Service Not More Than 5 years");
		}
	}

}

package Nested_if_else;

import java.util.*;
public class blood_donation {

	public static void main(String[] args) 
	{
		double wait,age,hb;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		age=sc.nextDouble();
		if(age>=18)
		{
			System.out.println("Enter Your Wait");
			wait=sc.nextDouble();
			if(wait>=55)
			{
				System.out.println("Enter Your HB");
				hb=sc.nextDouble();
				if(hb>=12)
				{
					System.out.println("Your Eligible For Boold Donation");
				}
				else
				{
					System.out.println("Your HB Is Not More Than 12");
				}
			}
			else
			{
				System.out.println("Your Wait Not More Than 55");
			}
		}
		else
		{
			System.out.println("Your Age Not Above 18");
		}
	}
}

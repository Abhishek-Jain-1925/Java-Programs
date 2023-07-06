package Nested_if_else;

import java.util.*;
public class mark_nested_if_else {

	public static void main(String[] args)
	{
		double ten_m,twel_m,lasty_m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10th Marks In Percentage");
		ten_m=sc.nextDouble();
		System.out.println("Enter 12th Marks In Percentage");
		twel_m=sc.nextDouble();
		System.out.println("Enter Last Year Marks In Percentage");
		lasty_m=sc.nextDouble();
		if(ten_m>=60)
		{
			if(twel_m>=60)
			{
				if(lasty_m>=60)
				{
					System.out.println("Your Eligible For Apptitude Test In MNC");
				}
				else
				{
					System.out.println("Your Last Year Marks Not Above 60%");
				}
			}
			else
			{
				System.out.println("Your 12th Marks Not Above 60% Percentage");
			}
		}
		else
		{
			System.out.println("Your 10th Marks Not Above 60% Percentage");
		}
	}

}

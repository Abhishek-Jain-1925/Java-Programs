package if_else_and_if_else_ladder;

import java.util.*;
public class if_else_leap_year {

	public static void main(String[] args) 
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year+ " is leap year");
		}
		else
		{
			System.out.println(year+ " is not leap year");
		}
		
	}

}

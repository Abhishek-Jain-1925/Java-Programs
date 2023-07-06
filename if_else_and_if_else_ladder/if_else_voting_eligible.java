package if_else_and_if_else_ladder;
// Check Voter Are Eligible for vote or Not

import java.util.*;
public class if_else_voting_eligible 
{

	public static void main(String[] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		if(age>=18 && age<=120)
		{
			System.out.println("You Are Eligible For Vote");
		}
		else if(age<=0)
		{
			System.out.println("Enter The Correct Age");
		}
		else
		{
			System.out.println("You Are Not Eligible For Vote");
		}
		
	}

}

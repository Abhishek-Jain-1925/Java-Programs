package if_else_and_if_else_ladder;

import java.util.Scanner;

public class Vaccine_eligible
{

	public static void main(String[] args) 
	{
		int vaccine;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Vaccine No.");
		vaccine=sc.nextInt();
		if(vaccine>=3)
		{
			System.out.println("You Are Eligible For Interview");
		}
		else if(vaccine<3 && vaccine>=1)
		{
			System.out.println("Pls, Complete Your Remaining Vaccine and Then Come To Again");
		}
		else
		{
			System.out.println("Sorry,You Are Not Eligible For Interview");
		}
			
	}

}

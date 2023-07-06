package if_else_and_if_else_ladder;

import java.util.Scanner;

public class atm_pin 
{

	public static void main(String[] args) 
	{
		double pin;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your 4 Digits Pin");
		pin=sc.nextDouble();
		if(pin==5262)
		{
			System.out.println("Pin Is Correct");
		}
		else
		{
			System.out.println("not corrected");
		}
	}

}

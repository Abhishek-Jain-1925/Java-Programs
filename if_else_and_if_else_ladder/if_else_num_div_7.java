package if_else_and_if_else_ladder;

import java.util.Scanner;

public class if_else_num_div_7 
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		num=sc.nextInt();
		if(num%7==0)
		{
			System.out.println(num+" Divisible by 7");
		}
		else
		{
			System.out.println(num+" Not Divisible by 7");
		}
	}
}

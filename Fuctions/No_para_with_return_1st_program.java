package Fuctions;

import java.util.Scanner;

public class No_para_with_return_1st_program 
{
	static int add_2nd_method()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return c;
	}
	
	public static void main(String args[])
	{
		System.out.println("\nResult Using Second Method");
		int c=add_2nd_method();
		System.out.println("Addition="+c);
	}
}

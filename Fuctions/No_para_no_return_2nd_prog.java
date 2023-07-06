package Fuctions;

import java.util.Scanner;

public class No_para_no_return_2nd_prog
{

	
	static void min()
	{
		System.out.println("......MINIMUM OF TWO NUMBERS......");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=(a<b)?a:b;
		System.out.println("Min="+c);
	}
	
	static void pattern()
	{

		System.out.println(".....Pattern Programs.....");
		int i,j,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" " +j);
			}
			System.out.println("");
		}
	}
	static void even_odd()
	{
		System.out.println("....EVEN NUM. and ODD NUM.");
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number ");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
	}
	public static void main(String[] args)
	{
		
		min();
		pattern();
		even_odd();
	}

}

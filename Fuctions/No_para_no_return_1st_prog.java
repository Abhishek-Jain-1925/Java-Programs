package Fuctions;

import java.util.Scanner;

public class No_para_no_return_1st_prog
{
  
	static void add()
	{
		System.out.println(".....Addition Program......");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of a");
		a=sc.nextInt();
		System.out.println("Enter Value of b");
		b=sc.nextInt();
		c=a+b;
		System.out.println("ADDITION\n"+a+"+"+b+"="+c);
	}
	
	static  void power()
	{
		System.out.println("\n\n Power Program");
		int a,b,c=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=1;i<=b;i++)
		c=c*a;
		System.out.println("Power="+c);		
	}	
	
	static  void max()
	{
		System.out.println("\n\n Max Of Two Numbers");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=(a>b)?a:b;
		System.out.println("Max="+c);		
	}


	public static void main(String[] args)
	{
			add();
			power();
			max();
			System.exit(0);	
	}

}

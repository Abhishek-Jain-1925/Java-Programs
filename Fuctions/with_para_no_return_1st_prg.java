package Fuctions;

import java.util.Scanner;

public class with_para_no_return_1st_prg
{
	static void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Add="+c);
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		add(a,b);
	}

}

package Fuctions;

import java.util.Scanner;

public class with_para_with_return_1st_prg
{
	static int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
		
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		int c=add(a,b);
		System.out.println("Add="+c);
	}
}

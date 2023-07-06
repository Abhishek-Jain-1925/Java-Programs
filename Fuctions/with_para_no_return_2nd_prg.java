package Fuctions;

import java.util.Scanner;

public class with_para_no_return_2nd_prg
{
	static void prime(int n)
	{
		int div = 0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				div=1;
				break;
			}
		}
		if(div==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");	
		}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		prime(n);
	}

}

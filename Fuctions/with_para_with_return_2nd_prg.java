package Fuctions;

import java.util.Scanner;

public class with_para_with_return_2nd_prg 
{
	static String prime(int n)
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
			return("Prime Number");
		}
		else
		{
			return("Not Prime Number");	
		}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		String s1=prime(n);
		System.out.println(s1);
	}

}

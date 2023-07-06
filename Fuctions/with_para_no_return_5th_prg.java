package Fuctions;

import java.util.Scanner;

public class with_para_no_return_5th_prg
{
	static void armstrong(int n)
	{
		int n1,sum=1;
		int p = n;
		for(int i=0;i<=n;i++)
		{
			n1=n%10;
			n=n/10;
			sum=n1*n1*n1;
		}
		if(p==sum)
		{
			System.out.println("Armstrong No");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		armstrong(n);
		
	}

}

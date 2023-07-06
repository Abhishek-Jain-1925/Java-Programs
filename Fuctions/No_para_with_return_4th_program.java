package Fuctions;

import java.util.Scanner;

public class No_para_with_return_4th_program
{
	
	static String armstrong_2nd_method()
	{
		int n,n1,sum=0,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		p=n;
		for(int i=1;i<=n;i++)
		{
			n1=n%10;
			n=n/10;
			sum=sum+(n1*n1*n1);
		}
		if(p==sum)
		{
			return("Number is Armstrong");
		}
		else
		{
			return("Number is not Armstrong");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n Result Using 2 nd Method");
		String s1=armstrong_2nd_method();
		System.out.println(s1);
	}

}

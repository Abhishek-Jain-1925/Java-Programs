package Fuctions;

import java.util.Scanner;

public class No_para_with_return_3rd_program
{

	static String perfect_2nd_method()
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			return(n+" is perfect no");
		}
		else
		{
			return(n+" is not perfect no");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\nResult Using 2nd Method");
		String s1=perfect_2nd_method();
		System.out.println(s1);
	}

}

package Fuctions;

import java.util.Scanner;

public class with_para_with_return_3rd_prg
{
	static String perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
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
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		String s1=perfect(n);
		System.out.println(s1);
	}

}

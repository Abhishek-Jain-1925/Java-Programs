package Fuctions;

import java.util.Scanner;

public class with_para_no_return_3rd_prg
{
	static void perfect(int n)
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
			System.out.println(n+" is perfect no");
		}
		else
		{
			System.out.println(n+" is not perfect no");
		}
	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		perfect(n);
	}

}

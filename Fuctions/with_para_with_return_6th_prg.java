package Fuctions;

import java.util.Scanner;

public class with_para_with_return_6th_prg
{
	static String magicNum(int n)
	{
		int n1,sum=0;
		while(n>9)
		{
			sum=0;
			while(n>0)
			{
				n1=n%10;
				n=n/10;
				sum=sum+n1;
			}
			n=sum;
		}			
		if(n==1)
			return("Number is magic");
		else
			return("Number not magic");
	}
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		String s1=magicNum(n);
		System.out.println(s1);
	}

}

package Fuctions;

import java.util.Scanner;

public class No_para_with_return_6th_program
{
	
	static String magicNum_2nd_method()
	{
		int n,n1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
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
		System.out.println("Result Using 2nd Method");
		String s1=magicNum_2nd_method();
		System.out.println(s1);
	}

}

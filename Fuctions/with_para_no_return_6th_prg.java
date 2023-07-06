package Fuctions;

import java.util.Scanner;

public class with_para_no_return_6th_prg
{
	static void magicNum(int n)
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
			System.out.println("Number is magic");
		else
			System.out.println("Number not magic");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		int n = sc.nextInt();
		magicNum(n);
	}

}

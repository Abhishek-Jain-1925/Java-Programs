package Fuctions;

import java.util.Scanner;

public class with_para_no_return_7th_prg 
{
	static void strongNum(int n)
	{
		int i,n1,sum=0,f=1,f1;
		f1=n;
		while(n>0)
		{
			f=1;
			n1=n%10;
			n=n/10;
			for(i=n1;i>1;i--)
			{
				f=f*i;
			}
			sum=sum+f;
		}
		if(f1==sum)
			System.out.println("Number is Strong");
		else
			System.out.println("Number Is Not Strong");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		int n = sc.nextInt();
		strongNum(n);
	}

}

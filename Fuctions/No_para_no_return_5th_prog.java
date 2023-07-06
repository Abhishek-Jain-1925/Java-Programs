package Fuctions;

import java.util.Scanner;

public class No_para_no_return_5th_prog 
{
	static void seies()
	{

		System.out.println("sum=1X+2X+3X+.....");
		int i,sum=0,n,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(i*x);
		}
		System.out.println("sum="+sum);
	}
	
	static void decimal_to_binary()
	{
		System.out.println("\n\n Decimal to Binary Conversion");
		int n,n1,sum=0,p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%2;
			n=n/2;
			sum=sum+(n1*p);
			p=p*10;
		}
		System.out.println("Binary="+sum);
	}
	
	static void _1arr_to_another()
	{
		System.out.println("\n\n 1 Array To Another Array");
		int i,n,div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements");
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println("Array Elements are");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n\nCoppied Elements are");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+b[i]);
		}
	}
	public static void main(String[] args)
	{
		seies();
		decimal_to_binary();
		_1arr_to_another();
	}
}

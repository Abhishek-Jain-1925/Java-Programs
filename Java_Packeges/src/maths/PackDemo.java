package maths;

import java.util.Scanner;

public class PackDemo 
{

	public static void main(String[] args) 
	{
		int a,b,n,i;
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter size");
		n=sc.nextInt();

		Addition a1[]=new Addition[n];
		Maximum m1[]=new Maximum[n];
		for( i=0;i<n;i++)
		{
			System.out.println("-----Addition--------");
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();

		a1[i]=new Addition(a, b);
		a1[i].calAdd();
		
		System.out.println("\n --------Maximum----------");
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		m1[i]=new Maximum(a,b);
		m1[i].calMax();
		}
	}
}

package ARRAY;

import java.util.Scanner;

public class Reverse_order 
{

	public static void main(String[] args)
	{
		int n,i;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];//array creation		
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();			
		}		
		System.out.println("\n\nArray elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n\nArray reverse elements are");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}
}

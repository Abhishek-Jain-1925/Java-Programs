package ARRAY;

import java.util.Scanner;

public class left_rotate_prg {

	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n\n After Rotation Array");
		for(i=2;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.print(" "+a[0]);
		System.out.print(" "+a[1]);
		
	}

}

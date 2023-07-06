package ARRAY;

import java.util.*;

public class copy_array_1toanother {

	public static void main(String[] args) 
	{
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

}

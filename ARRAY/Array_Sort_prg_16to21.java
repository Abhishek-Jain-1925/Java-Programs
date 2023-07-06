// Sorting Program 16 to 21
package ARRAY;

import java.util.Scanner;

public class Array_Sort_prg_16to21 
{

	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+n+" Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements Are");
		for(i=0;i<n;i++)
		{
			System.out.print(" \t"+a[i]);
		}

// Array Asending Order Program
		for(i=1;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(a[j] > a[j+1])
				{
						temp = a[j];  
	                    a[j] = a[j+1];  
	                    a[j+1] = temp;
				}
			}
		}
		System.out.println("\n\nArray Asending Order");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n\nLasrgest No. In an Array "+a[n-1]);
		System.out.println("\n\n2 nd last  highest "+a[n-2]);
		System.out.println("\n\n3 rd last  highest "+a[n-3]);
		System.out.println("\n\nSecond Smallest No. in Array "+a[1]);

// Array Desending Array Program		
		for(i=1;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(a[j] < a[j+1])
				{
						temp = a[j];  
	                    a[j] = a[j+1];  
	                    a[j+1] = temp;
				}
			}
		}
		System.out.println("\n\nArray In Desending Order");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}        
	}
}


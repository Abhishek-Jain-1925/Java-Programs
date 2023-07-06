package ARRAY;

import java.util.Scanner;

public class Alternate_no {

	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter " +n+ " Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements Are");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" \t");
		}
		System.out.println("Array Print Aftet Alternate");
		for(i=0;i<n;i=i+2)
		{
			System.out.println(a[i]+" \t");
		}
	}

}
 
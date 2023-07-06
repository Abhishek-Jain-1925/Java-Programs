// program num. 26,27
package ARRAY;

import java.util.Scanner;

public class Even_odd_Position_Print {

	public static void main(String[] args)
	{
		int i,n,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even Num. Position Array Are");
		for(i=1;i<n;i=i+2)
		{
			System.out.println(" "+a[i]);
		}
		System.out.println("Odd Nu. Position Array Are");
		for(i=0;i<n;i=i+2)
		{
			System.out.println(" "+a[i]);
		}
		
	}

}

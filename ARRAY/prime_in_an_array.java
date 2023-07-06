package ARRAY;

import java.util.Scanner;

public class prime_in_an_array {

	public static void main(String[] args) 
	{
		int n,i,div,n1,j;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];	
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		
		}		
		System.out.println("\n\nArray elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}		
		System.out.println("\n\nPrime elements are");
		for(i=0;i<n;i++)
		{
			n1=a[i];
			div=0;
			for(j=2;j<=(n1/2);j++)
			{
				if(n1%j==0)
				{
					div=1;
					break;
				}
			}
			if(div==0)
				System.out.print(a[i]+"\t");
		}
	}

}

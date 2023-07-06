package ARRAY;

import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) 
	{
		int n,i,n1;		
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
		System.out.println("\n\nPalindrome elements are");
		for(i=0;i<n;i++)
		{

			n1=a[i];
			int sum = 0;
			while(n1>0)
			{
				int g = n1%10;
				n1=n1/10;
				sum=(sum*10)+g;
			}
			if(sum==a[i])
				System.out.print(a[i]+"\t");		
		}
	}

}

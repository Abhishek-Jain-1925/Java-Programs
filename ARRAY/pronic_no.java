package ARRAY;

import java.util.Scanner;

public class pronic_no {

	public static void main(String[] args)
	{
		int n,i,n1,j;		
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
		System.out.println("\n\nPronic elements are");
		for(i=0;i<n;i++)
		{

			n1=a[i];
			int sum = 0;
			for(j=1;j<=(n1/2);j++)
			{
				if(n1==(j*(j+1)))
				{
					sum=1;
					break;
				}
			}
			if(sum==1)
				System.out.print(a[i]+"\t");		
		}
	}

}

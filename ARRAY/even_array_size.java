package ARRAY;

import java.util.Scanner;

public class even_array_size {

		public static void main(String[] args) 
		{
			int n,i,temp;		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size");
			n=sc.nextInt();		
			int a[]=new int[n];//array creation		
				

	if(n%2==0)
	{
			System.out.println("Enter "+ n +" Elements");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();	
			
			}		
			System.out.println("\nArray elements are");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+"\t");
			}	
	for(i=0;i<n;i=i+2)
	{
	temp=a[i];//temp=10
	a[i]=a[i+1];//a[0]=20
	a[i+1]=temp;//a[1]=10
	}
		for(i=0;i<n;i++)
			{
				System.out.print(a[i]+"\t");
			}	
	}
	else
	{
	System.out.println("\nArray size invalid");
	}
	}

}

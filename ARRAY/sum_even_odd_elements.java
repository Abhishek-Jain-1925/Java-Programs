package ARRAY;

import java.util.Scanner;

public class sum_even_odd_elements {

	public static void main(String[] args) 
	{
		int i,n,sum = 0,sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sum Of  Elements of An Array ");
		for(i=0;i<n;i++)
		{	
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			
			if(a[i]%2==1)
			{
				sum1=sum1+a[i];
			}
			
		}
		System.out.println("SUM of odd="+sum1);	
		System.out.println("SUM of even="+sum);
	}

}

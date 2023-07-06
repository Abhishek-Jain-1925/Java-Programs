package ARRAY;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) 
	{

		int i,n,sum=0,Min=0,Max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter " +n+ " Array Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Array Elements Are");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		Min=Max=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>Max)
			{
				Max=a[i];
			}
			if(a[i]<Min)
			{
				Min=a[i];
			}	
		}
		System.out.println("Max="+Max+"\t\t" + "Min="+Min);

	}

}

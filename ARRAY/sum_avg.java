package ARRAY;

import java.util.Scanner;

public class sum_avg {

	public static void main(String[] args) 
	{
		int i,n,sum=0;
		double avg;
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
		avg=sum/n;
		System.out.println("SUM="+sum+"\t\t" + "AVG="+avg);
	}

}

package ARRAY;

import java.util.Scanner;

public class frequency_check {

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int a[]=new int[n];
		int f[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			f[i]=-1;
		}
		for(int i = 0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
					f[j]=0;
					
				}
			}
			if(f[i]!=0)
			{
				f[i]=count;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(f[i]!=0)
			{
				System.out.println(a[i]+ " comes "+f[i]+" Times ");
			}
		}
		
	}

}

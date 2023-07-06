package ARRAY;

import java.util.Scanner;

public class Linear_search 
{

	public static void main(String[] args) 
	{
		int i,n,num,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		System.out.println("The elements are");
		for(i=0;i<n; i++){
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nEnter an element which u want to search?");
		num=sc.nextInt();
		for(i=0; i<n; i++)
		{
			
			if(a[i]==num)
			{
				flag=1;
				System.out.println("Element found AT POSITION "+(i+1));
				break;
			}
		}
		if(flag==0)
		{
			
		
			System.out.println("Element not found");
		}
	}
}

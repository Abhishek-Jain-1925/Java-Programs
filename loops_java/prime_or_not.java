package loops_java;

import java.util.Scanner;

public class prime_or_not 
{

	public static void main(String[] args) 
	{
		int i,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}

}

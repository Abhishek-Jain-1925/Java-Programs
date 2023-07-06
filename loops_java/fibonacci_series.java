package loops_java;

import java.util.Scanner;

public class fibonacci_series 
{

	public static void main(String[] args) 
	{
		int i,n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}

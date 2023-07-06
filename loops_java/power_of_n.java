package loops_java;

import java.util.Scanner;

public class power_of_n 
{

	public static void main(String[] args) 
	{
		int i,x,n,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		System.out.println("Enter value of power(n)");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=f1*x;
			System.out.println(x+"^"+i+"="+f1);
		}
	}

}

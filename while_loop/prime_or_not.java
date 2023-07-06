package while_loop;

import java.util.Scanner;

public class prime_or_not
{

	public static void main(String[] args) 
	{
		int i=2,n,div=0;
		Scanner sc=new 	Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(i<=n/2)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
			i++;
		}
		if(div==0)
		System.out.println("is prime num");
		else
			System.out.println("Is not prime");
	}

}

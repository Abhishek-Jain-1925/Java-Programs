package while_loop;

import java.util.Scanner;

public class Fabonacci_series 
{
	public static void main(String args[])
	{
		int i=1,n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			i++;	
		}
	}

}

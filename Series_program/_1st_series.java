package Series_program;
//sum=1X+2X+3X+.....

import java.util.Scanner;

public class _1st_series 
{

	public static void main(String[] args) 
	{
		int i,sum=0,n,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(i*x);
		}
		System.out.println("sum="+sum);
	}

}

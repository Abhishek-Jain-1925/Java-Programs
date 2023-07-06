package pattern_programs;

import java.util.Scanner;

public class _73rd_program
{

	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)													 // Even No. Code
		{
			for(j=0;j<=n;j++)
			{
				if(n%2==0)
				{
					if(i==(n/2) || j==(n/2))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		for(i=1;i<=n;i++)														// odd no code
		{
			for(j=1;j<=n;j++)
			{
				if(n%2==1)
				{
					if(i==(n/2)+1 || j==(n/2)+1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}

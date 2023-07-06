package pattern_programs;

import java.util.Scanner;

public class _74th_program
{

	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				
				if(i==0 || j==0 || i==n || j==n)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" "+j+" ");
				}
			}
			System.out.println(" ");
		}
	}

}

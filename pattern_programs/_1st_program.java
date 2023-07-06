package pattern_programs;
/*

1
1 2 
1 2 3 
1 2 3 4
1 2 3 4 5

*/

import java.util.Scanner;

public class _1st_program 
{

	public static void main(String[] args) 
	{
		int i,j,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{

			for(j=1;j<=i;j++)
			{
				System.out.print(" " +j);
			}
			System.out.println("");
		}
	}

}

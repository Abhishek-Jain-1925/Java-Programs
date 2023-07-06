package pattern_programs;
/*
 
 $ 
 $  $ 
 $  $  $ 
 $  $  $  $ 
 $  $  $  $  $
 
 */


import java.util.Scanner;

public class _4th_program 
{

	public static void main(String[] args) 
	{
		int i,j,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" $ ");
			}
			System.out.println("");
		}
	}

}

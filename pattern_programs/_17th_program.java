package pattern_programs;
/*
 
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 
 
 */

import java.util.Scanner;

public class _17th_program {

	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}

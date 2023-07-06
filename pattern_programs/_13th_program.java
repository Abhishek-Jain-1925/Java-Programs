package pattern_programs;
/*
 Aa 
 Aa Bb 
 Aa Bb Cc 
 Aa Bb Cc Dd 
 Aa Bb Cc Dd Ee

*/

import java.util.Scanner;

public class _13th_program
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=64, ch1=96; // Ascii Value of 'a' is 97
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(" "+(char)(ch+j)+(char)(ch1+j));  // Type Casting
			}
			System.out.println(" ");
		}
	}

}

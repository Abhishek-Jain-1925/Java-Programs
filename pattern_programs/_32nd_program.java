package pattern_programs;
/*
 a
 a b
 a b c
 a b c d
 a b c d e
 a b c d
 a b c
 a b
 a
 
*/
import java.util.Scanner;

public class _32nd_program 
{
	public static void main(String[] args)
	{
		int k=1,i,j,n = 0,ch=96;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)//row
		{
			for(j=1;j<=i ; j++ )//column
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println("");
		}
		for(i=n-1;i>=1;i--)//row
		{
			for(j=1;j<=i ; j++ )//column
			{
				System.out.print(" "+(char)(ch+j));
			}
		System.out.println("");
		}
	}
}

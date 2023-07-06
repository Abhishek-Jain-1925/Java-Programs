package pattern_programs;
/*
 
 A 
 A B 
 A B C 
 A B C D 
 A B C D E
 
 */
import java.util.Scanner;

public class _7th_program 
{

	public static void main(String[] args)
	{
		int i,j,n,ch=64,k=1; // Ascii Value of 'A' is 65
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");
		}
	}

}

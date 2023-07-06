package pattern_programs;
/*
 Ee Ee Ee Ee Ee 
 Dd Dd Dd Dd 
 Cc Cc Cc 
 Bb Bb 
 Aa 
*/
import java.util.Scanner;

public class _28th_program
{

	public static void main(String[] args) 
	{
		int i,j,n,ch=64, ch1=96;; // Ascii Value of 'a' is 97
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(" "+(char)(ch+i)+(char)(ch1+i));  // Type Casting
			}
			System.out.println(" ");
		}
	}

}

package pattern_programs;
/*
 e e e e e 
 d d d d 
 c c c 
 b b 
 a
 */
import java.util.Scanner;

public class _24th_program 
{

	public static void main(String[] args) 
	{

		int i,j,n,ch=96,k=1; // Ascii Value of 'a' is 97
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+i));  // Type Casting
			}
			System.out.println(" ");
		}
	}

}

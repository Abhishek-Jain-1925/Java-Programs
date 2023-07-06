package pattern_programs;
/*
 a b c d e 
 f g h i 
 j k l 
 m n 
 o 
 */
import java.util.Scanner;

public class _25th_program 
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
				
				System.out.print(" "+(char)(ch+k++));  // Type Casting
			}
			System.out.println(" ");
		}
	}

}

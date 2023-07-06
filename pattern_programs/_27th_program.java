package pattern_programs;
/*
 Aa Bb Cc Dd Ee 
 Aa Bb Cc Dd 
 Aa Bb Cc 
 Aa Bb 
 Aa
 
 */
import java.util.Scanner;

public class _27th_program {

	public static void main(String[] args) 
	{
		int i,j,n,ch=64, ch1=96; // Ascii Value of 'a' is 97
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(" "+(char)(ch+j)+(char)(ch1+j));  // Type Casting
			}
			System.out.println(" ");
		}
	}

}

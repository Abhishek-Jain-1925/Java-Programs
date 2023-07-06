package pattern_programs;
/*
 E E E E E 
 D D D D 
 C C C 
 B B 
 A 
 */
import java.util.Scanner;

public class _22nd_program {

	public static void main(String[] args) 
	{
		int i,j,n,ch=64,k=1; // Ascii Value of 'A' is 65
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(ch+i));
			}
			System.out.println(" ");
		}

	}

}

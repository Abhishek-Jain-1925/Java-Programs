package pattern_programs;
/*
 
 A 
 B B 
 C C C 
 D D D D 
 E E E E E
 
 */
import java.util.Scanner;

public class _8th_program 
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
				System.out.print(" "+(char)(ch+i));
			}
			System.out.println(" ");
		}
	}

}

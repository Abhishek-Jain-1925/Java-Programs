package pattern_programs;
/*
 a b c d e
 a b c d
 a b c
 a b
 a
 a b
 a b c
 a b c d
 a b c d e
 */
import java.util.Scanner;

public class _33rd_program {

	public static void main(String[] args) 
	{
		int k=1,i,j,n = 0,ch=96;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=n;i>=2;i--)//row
		{
			for(j=1;j<=i;j++ )//column
			{
				System.out.print(" "+(char)(ch+j));
			}
		System.out.println("");
		}
		for(i=1;i<=n;i++)//row
		{
			for(j=1;j<=i;j++ )//column
			{
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println("");
		}
	}

}

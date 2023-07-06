package pattern_programs;
/*
     a 
    b c 
   d e f 
  g h i j 
 k l m n o 
 
 */
import java.util.Scanner;

public class _43rd_program 
{

	public static void main(String[] args)
	{
		int i,j,n,k,ch=97;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+(char)ch++);
			}
			System.out.println(" ");
		}
	}

}

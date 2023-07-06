package pattern_programs;
/*
    * 
   ** 
  *** 
 **** 
***** 
 **** 
  *** 
   ** 
    *
 */
import java.util.Scanner;

public class _72nd_program {

	public static void main(String[] args)
	{
		int i,j,n,k;
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
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=n-1;i>=1;i--)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}

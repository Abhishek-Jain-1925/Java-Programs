package pattern_programs;
/*
 1 2 3 4 5 
  1 2 3 4 
   1 2 3 
    1 2 
     1
 */
import java.util.Scanner;

public class _48th_program 
{

	public static void main(String[] args)
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}

}

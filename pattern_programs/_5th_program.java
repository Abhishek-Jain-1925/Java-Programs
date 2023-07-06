package pattern_programs;
/*

 1
 3 5
 7 9 11
 13 15 17 19
 21 23 25 27 29
 
 */
import java.util.Scanner;

public class _5th_program 
{

	public static void main(String[] args) 
	{
		int i,j,n,k = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
			    System.out.print(" "+k);
				k=k+2;
				
			}
			System.out.println("");
		}
	}

}

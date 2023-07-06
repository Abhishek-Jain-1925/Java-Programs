package pattern_programs;
/*
*****
 ****
  ***
   **
    *
 */
import java.util.Scanner;

public class _71st_program {

	public static void main(String[] args) 
	{
		int i,j,n,k,ch=65;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)//row
		{

			for(k=n;k>i;k--)//spaces
			{
				System.out.print(" ");
			}

			for(j=1;j<=i;j++)//column
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}

}

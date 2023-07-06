package pattern_programs;
/*
 * 
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 
 */
import java.util.Scanner;

public class _2nd_program {

	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println("");
		}
		
	}

}

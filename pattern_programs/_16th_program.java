package pattern_programs;
/*

 5 5 5 5 5 
 4 4 4 4 
 3 3 3 
 2 2 
 1 
 
 */
import java.util.Scanner;

public class _16th_program {

	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	}

}

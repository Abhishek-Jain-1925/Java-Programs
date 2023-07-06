package pattern_programs;
/*
 1 2 3 4 5 
 6 7 8 9 
 10 11 12 
 13 14 
 15 
 
 */
import java.util.Scanner;

public class _20th_program {

	public static void main(String[] args)
	{
		int i,j,n,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+k++);
			}
			System.out.println(" ");
			
		}
	}

}

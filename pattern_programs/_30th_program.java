package pattern_programs;
/*
 1 
 0 0 
 1 1 1 
 0 0 0 0 
 1 1 1 1 1 

 */
import java.util.Scanner;

public class _30th_program {

	public static void main(String[] args) 
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print(" 1");
				}
				else
				{
					System.out.print(" 0");
				}
			}
			System.out.println(" ");
		}

	}

}

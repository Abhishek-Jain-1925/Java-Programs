package pattern_programs;
/*
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 

 */
import java.util.Scanner;

public class _35th_program {

	public static void main(String[] args) 
	{
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
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

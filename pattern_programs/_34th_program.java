package pattern_programs;
/*
    *  
   * *  
  * * *  
 * * * *  
* * * * *  

 */
import java.util.Scanner;

public class _34th_program {

	public static void main(String[] args) 
	{
		int i,n,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)// Space
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}

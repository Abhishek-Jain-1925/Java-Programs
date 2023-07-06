package pattern_programs;
/*
   1 3 5 7 9 
  11 13 15 17 
   19 21 23 
    25 27 
     29
 */
import java.util.Scanner;

public class _51st_program 
{

	public static void main(String[] args) 
	{
		int i,j,n,k,a=0;
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
				a=a+1;
				System.out.print(" "+a++);
			}
			System.out.println(" ");
		}
		
	}

}

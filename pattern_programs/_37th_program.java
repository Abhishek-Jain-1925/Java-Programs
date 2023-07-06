package pattern_programs;
/*
       1 
      3 5 
     7 9 11 
  13 15 17 19 
 21 23 25 27 29 
 
 */
import java.util.Scanner;

public class _37th_program 
{

	public static void main(String[] args) 
	{
		int i,n,j,k,a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+a);
				a=a+2;
			}
			System.out.println(" ");
		}

	}

}

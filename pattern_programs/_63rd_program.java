package pattern_programs;
/*
    	 1
   	   3 5
     7 9 11
13 15 17 19


*/
import java.util.Scanner;

public class _63rd_program {

	public static void main(String[] args) 
	{
		int i,j,n,k,a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				
				System.out.print(""+a);
				a=a+2;
			}
			System.out.println("");
		}
	}

}

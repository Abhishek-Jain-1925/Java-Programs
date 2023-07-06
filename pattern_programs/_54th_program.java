package pattern_programs;
/*
 E E E E E 
  D D D D 
   C C C 
    B B 
     A 
 */
import java.util.Scanner;

public class _54th_program {

	public static void main(String[] args)
	{
		int i,j,n,k,ch=64;
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
				
				System.out.print(" "+(char)(ch+i));
			}
			System.out.println(" ");
		}

	}

}

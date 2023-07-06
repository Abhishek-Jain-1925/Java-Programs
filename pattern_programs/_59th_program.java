package pattern_programs;
/*
 Aa Bb Cc Dd Ee 
  Ff Gg Hh Ii 
   Jj Kk Ll 
    Mm Nn 
     Oo 
 */
import java.util.Scanner;

public class _59th_program {

	public static void main(String[] args)
	{
		int i,j,n,k,ch=65,ch1=97;
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
				
				System.out.print(" "+(char)(ch++)+(char)(ch1++));
			}
			System.out.println(" ");
		}

	}

}

package pattern_programs;
/*
Ee Ee Ee Ee Ee 
  Dd Dd Dd Dd 
   Cc Cc Cc 
    Bb Bb 
     Aa 
 */
import java.util.Scanner;

public class _60th_program {

	public static void main(String[] args)
	{
		int i,j,n,k,ch=64,ch1=96;
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
				
				System.out.print(" "+(char)(ch+i)+(char)(ch1+i));
			}
			System.out.println(" ");
		}

	}

}

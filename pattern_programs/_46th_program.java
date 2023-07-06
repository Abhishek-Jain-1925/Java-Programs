package pattern_programs;
/*
      Aa 
    Bb Bb 
   Cc Cc Cc 
  Dd Dd Dd Dd 
 Ee Ee Ee Ee Ee 
 */
import java.util.Scanner;

public class _46th_program {

	public static void main(String[] args)
	{
		int i,j,n,k,ch=64,ch1=96;
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
				System.out.print(" "+(char)(ch+i)+(char)(ch1+i));
			}
			System.out.println(" ");
		}

	}

}

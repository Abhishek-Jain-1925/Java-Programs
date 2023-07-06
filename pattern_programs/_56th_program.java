package pattern_programs;
/*
 e e e e e 
  d d d d 
   c c c 
    b b 
     a 
 */
import java.util.Scanner;

public class _56th_program {

	public static void main(String[] args)
	{
		int i,j,n,k,ch=96;
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

package pattern_programs;
/*
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
 
 */
import java.util.Scanner;

public class _39th_program {

	public static void main(String[] args) 
	{
		int i,j,n,k,ch=64;
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
				System.out.print(" "+(char)(ch+j));
			}
			System.out.println(" ");
		}

	}

}

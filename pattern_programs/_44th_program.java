package pattern_programs;
/*
     A 
    B C 
   D E F 
  G H I J 
 K L M N O
 
 */
import java.util.Scanner;

public class _44th_program {

	public static void main(String[] args) 
	{
		int i,j,n,k,ch=65;
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
				System.out.print(" "+(char)ch++);
			}
			System.out.println(" ");
		}
	}

}

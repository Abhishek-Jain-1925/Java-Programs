package pattern_programs;
/*
 
 * # * # * 
 # * # * # 
 * # * # * 
 # * # * # 
 * # * # *  
 
 */
import java.util.Scanner;

public class _31st_program {

	public static void main(String[] args) 
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=1;j--)
			{
				if((j+i)%2==0)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" #");
				}
			}
			System.out.println(" ");
		}
	}

}

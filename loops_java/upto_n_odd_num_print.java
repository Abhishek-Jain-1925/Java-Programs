package loops_java;

import java.util.Scanner;

public class upto_n_odd_num_print 
{

	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Value Of N");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2)
		{
			System.out.println(" " +i);
		}
	}

}

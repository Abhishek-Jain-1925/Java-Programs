package loops_java;

import java.util.Scanner;

public class upto_n_even_no_print 
{
	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
		{
			System.out.println(" " +i);
		}
	}

}

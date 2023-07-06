package loops_java;

import java.util.*;
public class _1_to_n_num_print {

	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(" "+i);
		}
	}

}

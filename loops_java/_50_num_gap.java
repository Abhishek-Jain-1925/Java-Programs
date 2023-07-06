package loops_java;

import java.util.Scanner;

public class _50_num_gap {

	public static void main(String[] args) 
	{
		int i,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of i");
		i=sc.nextInt();
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(j=i;j<=n;j=j+50)
		{
			System.out.println(" "+j);
		}
		
	}

}

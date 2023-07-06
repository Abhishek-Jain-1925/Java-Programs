package loops_java;

import java.util.Scanner;

public class print_num_desending_order 
{

	public static void main(String[] args) 
	{
		int i,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			System.out.println(" "+i);
		}
	}

}

package loops_java;

import java.util.Scanner;

public class print_mul_table 
{

	public static void main(String[] args) 
	{
		int i,n,f1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			f1=n*i;
			System.out.println(n+"*"+i+"="+f1);
		}
	}
}

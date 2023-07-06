package loops_java;

import java.util.Scanner;

public class multi_table_without_use_star_op 
{

	public static void main(String[] args) 
	{
		int i,n,f1 = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N");
		n=sc.nextInt();

			for(i=1;i<=10;i++)
			{
				f1=f1+n;
				System.out.println(n+"*"+i+"=" +f1);
			}
			
	}

}

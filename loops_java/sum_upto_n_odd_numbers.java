package loops_java;

import java.util.Scanner;

public class sum_upto_n_odd_numbers
{

	public static void main(String[] args) 
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of N ");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+2)
		{
			sum=sum+i;
			System.out.println("Sum= " +sum);
		}
		
		
	}

}

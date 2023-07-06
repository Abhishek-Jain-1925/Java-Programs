package loops_java;

import java.util.Scanner;

public class sum_upto_n_even_num {

	public static void main(String[] args) 
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
		{
			sum=sum+i;
			System.out.println("Sum Of Even No." +sum);
		}
		
	}

}

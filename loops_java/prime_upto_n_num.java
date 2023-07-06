package loops_java;

import java.util.Scanner;

public class prime_upto_n_num {

	public static void main(String[] args) 
	{
		int i,j,n = 0,n1,div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n1=sc.nextInt();
		for(j=2;j<=n1;j++)
		{
			n=j;
			div=0;
			for(i=2;i<=(n/2);i++)
			{
				if(n%i==0)
				{
					div=1;
					break;
				}
			}
			if(div==0)
			{
				System.out.println(" "+n);
			}
		}
	}

}

package loops_java;

import java.util.Scanner;

public class perfect_uotp_n_num {

	public static void main(String[] args)
	{
		int i,j,n,n1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Value Of n");
		n1=sc.nextInt();
		for(j=2;j<=n1;j++)
		{
			n=j;
			sum=0;
			for(i=1;i<=(n/2);i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==n)
			{
				System.out.println(" "+n);
					
			}
		}
	}

}

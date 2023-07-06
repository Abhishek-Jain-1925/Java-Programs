package while_loop;

import java.util.Scanner;

public class strong_or_not {

	public static void main(String[] args)
	{
		int i,n,n1,sum=0,f=1,f1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		f1=n;
		while(n>0)
		{
			f=1;
			n1=n%10;
			n=n/10;
			for(i=n1;i>1;i--)
			{
				f=f*i;
			}
			sum=sum+f;
		}
		if(f1==sum)
		System.out.println("Number is Strong");
		else
			System.out.println("Number Is Not Strong");
		
	}

}

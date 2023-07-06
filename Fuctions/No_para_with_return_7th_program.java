package Fuctions;

import java.util.Scanner;

public class No_para_with_return_7th_program
{	
	static String strongNum_2nd_method()
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
			return("Number is Strong");
		else
			return("Number Is Not Strong");
	}
	public static void main(String[] args)
	{
			System.out.println("Result Using 2nd Method");
			String s1=strongNum_2nd_method();
			System.out.println(s1);
	}

}

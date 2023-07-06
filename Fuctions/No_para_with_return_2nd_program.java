package Fuctions;

import java.util.Scanner;

public class No_para_with_return_2nd_program
{
	
	
	static String prime_2nd_method()
	{
		int n,i,div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=2;i<=(n/2);i++)
		{
			if(n%2==0)
			{
				div=1;
				break;
			}
		}
		if(div==0)
		{
			return(n+" is Prime Number");
		}
		else
		{
			return(n+" is Not Prime Number");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\nResult Using 2nd Method");
		String s1=prime_2nd_method();
		System.out.println(s1);
	}

}

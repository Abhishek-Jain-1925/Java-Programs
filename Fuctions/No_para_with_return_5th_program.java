package Fuctions;

import java.util.Scanner;

public class No_para_with_return_5th_program
{
	
	static String palindrome_2nd_method()
	{
		int n,n1,sum=0,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		p=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		if(p==sum)
			return("Number is palindrome");
		else
			return("Number is not palindrome");
	}
	public static void main(String[] args) 
	{		
		System.out.println("\nResult Using 2nd Method");
		String s1=palindrome_2nd_method();
		System.out.println(s1);
	}

}

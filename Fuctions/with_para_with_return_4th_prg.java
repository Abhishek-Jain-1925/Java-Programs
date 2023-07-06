package Fuctions;

import java.util.Scanner;

public class with_para_with_return_4th_prg
{
	static String palindrome(int n)
	{
		int n1,sum=0,p = 0;
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
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		String s1=palindrome(n);
		System.out.println(s1);
	}

}

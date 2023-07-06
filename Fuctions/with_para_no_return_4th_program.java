package Fuctions;

import java.util.Scanner;

public class with_para_no_return_4th_program 
{
	static void palindrome(int n)
	{
		int n1,sum=0,p = 0;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		if(p==sum)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		palindrome(n);
	}

}

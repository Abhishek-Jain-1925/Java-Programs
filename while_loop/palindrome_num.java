package while_loop;

import java.util.Scanner;

public class palindrome_num {

	public static void main(String[] args) 
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
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

}

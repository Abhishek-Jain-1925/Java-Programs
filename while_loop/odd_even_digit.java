package while_loop;

import java.util.Scanner;

public class odd_even_digit {

	public static void main(String[] args) 
	{
		int n,n1,a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n =n/10;
			if(n1==0)
			a++;
			else if(n1%2==0)
			b++;
			else
			c++;
		}
		System.out.println("No. of Zero="+a);
		System.out.println("No. of Even Digit="+b);
		System.out.println("No. of Odd Digit="+c);
	}

}

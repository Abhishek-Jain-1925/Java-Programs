package while_loop;

import java.util.Scanner;

public class sum_1st_last_digit {

	public static void main(String[] args) 
	{
		int n,n1,n2,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		n1=n%10;							// for last digit
		while(n>0)
		{
			n2=n%10;						// first digit
			n=n/10;
			sum=n1+n2;
		}
		System.out.println("sum="+sum);
	}

}

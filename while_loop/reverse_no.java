package while_loop;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args)
	{
		int n,n1,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			rev=(rev*10)+n1;
		}
		System.out.println("Reverse " +rev);
	}

}

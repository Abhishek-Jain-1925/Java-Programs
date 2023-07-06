package while_loop;

import java.util.Scanner;

public class count_odd_digit {

	public static void main(String[] args)
	{
		int n1,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			if(n1%2==1)
//			if(n1==1 || n1==3 || n1==5 || n1==7 || n1==9)
			count++;
		}
		System.out.println("odd Number Digit Count="+count++);
	}

}

package while_loop;

import java.util.Scanner;

public class count_even_digit {

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
			if(n1%2==0)
//			if(n1==2 || n1==4 || n1== 6 || n1==8)
			count++;
		}
		System.out.println("even Number Digit Count="+count++);
	}

}

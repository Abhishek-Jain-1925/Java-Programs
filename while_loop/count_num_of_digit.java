package while_loop;

import java.util.Scanner;

public class count_num_of_digit {

	public static void main(String[] args)
	{
		int n1,n,cntp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			cntp++;
		}
		System.out.println("Number of Digit="+cntp++);
		
	}

}

package if_else_and_if_else_ladder;

import java.util.Scanner;

public class seller_amt {

	public static void main(String[] args) 
	{
		double amt, discount, total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		amt=sc.nextDouble();
		if(amt<10000)
		{
			System.out.println("No Discount");
		}
		else if(amt>=10000 && amt<20000)
		{
			discount=amt*0.05;
			total=amt-discount;
			System.out.println("Discount "+discount+" Total Amount Paid=" +total);
		}
		else if(amt>=20000 && amt<50000)
		{
			discount=amt*0.07;
			total=amt-discount;
			System.out.println("Discount "+discount+" Total Amount Paid=" +total);
		}
		else if(amt>=50000)
		{
			discount=amt*0.1;
			total=amt-discount;
			System.out.println("Discount "+discount+" Total Amount Paid=" +total);
		}
		else
		{
			System.out.println("For Discount Shopping First");
		}
	}	

}

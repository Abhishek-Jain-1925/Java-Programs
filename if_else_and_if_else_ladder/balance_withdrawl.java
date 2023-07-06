package if_else_and_if_else_ladder;
// Accept balance amount and withdrawal amount if withdrawal amount is greater than balance amount
// then print insuffient balance other wise display remaining balance after withdrawal amount

import java.util.*;
public class balance_withdrawl 
{

	public static void main(String[] args) 
	{
		double bal_amt,withd_amt,remain_bal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Balance Amount");
		bal_amt=sc.nextDouble();
		System.out.println("Enter Your Withdrawal Amount");
		withd_amt=sc.nextDouble();
		if(withd_amt>bal_amt)
		{
			System.out.println("Sorry, Insuffient Balance");
		}
		else
		{
			remain_bal=(bal_amt-withd_amt);
			System.out.println("Remaining Balance=" +remain_bal);
		}
	}

}

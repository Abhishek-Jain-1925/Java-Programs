package if_else_and_if_else_ladder;
// Accept loan amount from user and calculate interest amount for 5 years of duration 

import java.util.*;
public class loan_amt {

	public static void main(String[] args)
	{
		/*double loan_amt, sim_inte,emi,in_rate,ir;
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Loan Amount");
		loan_amt=sc.nextDouble();
		System.out.println("Enetr a Interest Rate Apply In Percentage(%)");
		in_rate=sc.nextDouble();
		System.out.println("Enter Year");
		year=sc.nextInt();
		if(loan_amt>=100000 && loan_amt<1000000)
		{
			ir=in_rate/100;
			sim_inte=(loan_amt*ir*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		else if(loan_amt>=1000000 && loan_amt<10000000)
		{
			ir=in_rate/100;
			sim_inte=(loan_amt*ir*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		else 
		{
			ir=in_rate/100;
			sim_inte=(loan_amt*ir*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		*/
		
		
		
		double loan_amt, sim_inte,emi;
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Loan Amount");
		loan_amt=sc.nextDouble();
		System.out.println("Enter Year");
		year=sc.nextInt();
		if(loan_amt>=100000 && loan_amt<1000000)
		{
			sim_inte=(loan_amt*0.05*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		else if(loan_amt>=1000000 && loan_amt<10000000)
		{
			sim_inte=(loan_amt*0.07*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		else 
		{
			sim_inte=(loan_amt*0.09*year);
			emi=(loan_amt+sim_inte)/(12*year);
			System.out.println("Simple Interest=" +sim_inte+" Emi Per Month=" +emi);
		}
		
		
		
	}

}

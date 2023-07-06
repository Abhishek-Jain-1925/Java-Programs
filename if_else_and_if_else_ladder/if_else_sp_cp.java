package if_else_and_if_else_ladder;
// Accept Selling Price & cost price from user and display profit amount or loss amount or none

import java.util.*;
public class if_else_sp_cp {

	public static void main(String[] args) {
		double sp,cp,amt,display;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Selling Price And Cost Price");
		sp=sc.nextDouble();
		cp=sc.nextDouble();
		if(sp>cp)
		{
			amt=sp-cp;
			display=(amt/cp)*100;
			System.out.println("profit=" +amt+ "percentage=" +display);
		}
		else if(cp>sp)
		{
			amt=cp-sp;
			display=(amt/cp)*100;
			System.out.println("loss=" +amt+ "percentage=" +display);
		}
		else
		{
			System.out.println("No Profit No loss");
		}
	}

}

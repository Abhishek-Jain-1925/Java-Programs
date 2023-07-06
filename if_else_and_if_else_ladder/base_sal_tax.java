package if_else_and_if_else_ladder;
// Accepet Base Salary From User and Display Its Tax

import java.util.Scanner;

public class base_sal_tax {

	public static void main(String[] args) 
	{
		double base_sal, tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Base Salary");
		base_sal=sc.nextDouble();
		if(base_sal<150000)
		{
			System.out.println("No Tax");
		}
		else if(base_sal>=150000 && base_sal<300000)
		{
			tax=base_sal*0.05;
			System.out.println("Total Tax Paid=" +tax);
		}
		else
		{
			tax=base_sal*0.07;
			System.out.println("Total Tax Paid=" +tax);
		}
	}

}

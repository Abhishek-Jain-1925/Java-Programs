package if_else_and_if_else_ladder;

import java.util.Scanner;

/*Write A Program to Calculate the monthly income of a person using the folliwing commision 
 schedule  */
public class month_income {

	public static void main(String[] args)
	{
		double sale,commision,total ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Monthaly sale");
		sale=sc.nextDouble();
		if(sale<5000)
		{
			System.out.println("No Commision");
		}
		else if(sale>=5000 && sale<10000)
		{
			commision=(sale*0.03);
			total=200+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
		else if(sale>=10000 && sale<20000)
		{
			commision=(sale*0.05);
			total=250+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
		else if(sale>=20000 && sale<30000)
		{
			commision=(sale*0.09);
			total=300+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
		else if(sale>=30000 && sale<40000)
		{
			commision=(sale*0.12);
			total=325+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
		else if(sale>=40000 && sale<50000)
		{
			commision=(sale*0.14);
			total=370+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
		else
		{
			commision=(sale*0.16);
			total=375+commision;
			System.out.println("Commision Amount=" +commision+" Total Paid=" +total);
		}
	}

}

package if_else_and_if_else_ladder;

import java.util.Scanner;

// Accept Light Unit and print bill (unit wise bill change)
public class light_bill {

	public static void main(String[] args) 
	{
		double unit,Elec_char;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Bill Unit");
		unit=sc.nextDouble();
		if(unit<=100)
		{
			Elec_char=unit*3.14;
			System.out.println("Electic Bill Amount=" +Elec_char);
		}
		else if(unit>=101 && unit<=300)
		{
			Elec_char=unit*5.14;
			System.out.println("Electic Bill Amount=" +Elec_char);
		}
		else if(unit>=301 && unit<=500)
		{
			Elec_char=unit*8.14;
			System.out.println("Electic Bill Amount=" +Elec_char);
		}
		else if(unit>=501 && unit<=1000)
		{
			Elec_char=unit*10.14;
			System.out.println("Electic Bill Amount=" +Elec_char);
		}
		else
		{
			Elec_char=unit*13.14;
			System.out.println("Electic Bill Amount=" +Elec_char);
		}
	}

}

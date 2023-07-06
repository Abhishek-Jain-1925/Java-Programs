package if_else_and_if_else_ladder;

import java.util.Scanner;

public class if_else_positive_negative {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+ " is positive");
		}
		else if(num<0)
		{
			System.out.println(num+ " is Negative");
		}
		else
		{
			System.out.println("Entered number."
					+ ""
					+ " is Zero");
		}
		
	}

}

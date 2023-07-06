package if_else_and_if_else_ladder;

import java.util.*;
public class if_else_div_5_7 {

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number");
		num=sc.nextInt();
		if(num%5==0 || num%7==0)
		{
			System.out.println(num+ " is divisible by 5 or 7");
		}
		else
		{
			System.out.println(num+ " is not divisible by 5 or 7");
		}
	}

}

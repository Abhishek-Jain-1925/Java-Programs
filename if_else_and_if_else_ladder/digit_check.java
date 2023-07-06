package if_else_and_if_else_ladder;

import java.util.*;
public class digit_check 
{

	public static void main(String[] args) 
	{
		long num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		num=sc.nextLong();
		if(num>=0 && num<=9)
		{
			System.out.println("Entered Number Are One Digit");
		}
		else if(num>=10 && num<=99)
		{
			System.out.println("Entered Number Are Two Digit");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println("Entered Number Are Three Digit");
		}
		else if(num>=1000 && num<=9999)
		{
			System.out.println("Entered Number Are Four Digit");
		}
		else
		{
			System.out.println("Number above 4 digits");
		}
	}

}

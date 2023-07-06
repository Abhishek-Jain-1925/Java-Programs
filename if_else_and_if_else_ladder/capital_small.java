package if_else_and_if_else_ladder;

import java.util.*;
public class capital_small {

	public static void main(String[] args) 
	{
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Char");
		s1=sc.next();
		ch=s1.charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+"  Is Small");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+"  Is Capital");
		}
		else
		{
			System.out.println(ch+" Is Not Alphabate");
		}
		
	}

}

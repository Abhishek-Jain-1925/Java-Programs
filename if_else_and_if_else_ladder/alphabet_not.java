package if_else_and_if_else_ladder;

import java.util.*;
public class alphabet_not {

	public static void main(String[] args) 
	{
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String Or Char");
		s1=sc.next();
		ch=s1.charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch+ " Is Alphabate");
		}
		else
		{
			System.out.println(ch+ " Is Not Alphabate");
		}
	}

}

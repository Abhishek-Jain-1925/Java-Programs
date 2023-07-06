package if_else_and_if_else_ladder;

import java.util.Scanner;

public class special_char_not {

	public static void main(String[] args)
	{
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String or Char or number");
		s1=sc.next();
		ch=s1.charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=0 && ch<=9))
		{
			System.out.println(ch+" is Not Special Character");
		}
		else
		{
			System.out.println(ch+" is a special character");
		}
		
		
	}

}

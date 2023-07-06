package if_else_and_if_else_ladder;

import java.util.*;
public class digit_not {

	public static void main(String[] args) 
	{
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		s1=sc.next();
		ch=s1.charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" Is Number");
		}
		else
		{
			System.out.println(ch+" Is not Number");
		}
		
	}

}

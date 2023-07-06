package String_Programs;

import java.util.Scanner;

public class String_PalinDrome
{

	public static void main(String[] args)
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String");
		s1=sc.next();
		
		StringBuffer s2=new StringBuffer(s1);
		
		s2.reverse();
		
		String s3=new String(s2);
		if(s1.equals(s3))
		{
			System.out.println("String Is PalinDrome");
		}
		else
		{
			System.out.println("String Is Not PalinDrome");
		}
		

	}

}

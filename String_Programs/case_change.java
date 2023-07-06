package String_Programs;

import java.util.Scanner;

public class case_change
{
	public static void main(String[] args)
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String");
		s1=sc.next();
		
		StringBuffer sb1=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s1.toUpperCase() != null)
			{
				System.out.println(s1);
			}
			if(s1.toLowerCase() != null)
			{
				System.out.println(s1);
			}
		}
	}
}

package loops_java;

import java.util.*;
public class display_n_char 
{

	public static void main(String[] args) 
	{
		int i,n;
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char");
		s1=sc.next();
		ch=s1.charAt(0);
		System.out.println("Enter Range n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(ch++);
		}
	}

}

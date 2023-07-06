package if_else_and_if_else_ladder;

import java.util.Scanner;

public class vovel_not {

	public static void main(String[] args) 
	{
		char ch;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Character");
		s1=sc.next();
		ch=s1.charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E'  || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			System.out.println(ch+ " Is vovel");
		}
		else
		{
			System.out.println(ch+ " Is not vovel");
		}
		
	}

}

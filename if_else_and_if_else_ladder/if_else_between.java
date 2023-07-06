package if_else_and_if_else_ladder;

import java.util.*;
public class if_else_between
{
	public static void main(String[] args) 
	{
		// 1. First no. is between range of second no and third no
		/*int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a , b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a<c)
		{
			System.out.println(a+" is between" +b+" and" +c);
		}
		else
		{
			System.out.println(a+" not is between" +b+" and" +c);
		}*/
		
		/* 2.Second no. is between range of first no and third no
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a , b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b>a&&b<c)
		{
			System.out.println(b+" is between" +a+" and" +c);
		}
		else
		{
			System.out.println(b+" not is between" +a+" and" +c);
		}
		*/
		
		// Third no. is between range of first no. and second
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a , b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((c>a&&c<b)||(c<a&&c>b))
		{
			System.out.println(c+" is between" +a+" and" +b);
		}
		else
		{
			System.out.println(c+" not is between" +a+" and" +b);
		}
		
	}
}

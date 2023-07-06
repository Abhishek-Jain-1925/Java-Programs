package if_else_and_if_else_ladder;

import java.util.*;
public class max_4no {

	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value a , b, c, d");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a>b && a>c && a>d)
		{
			System.out.println(a+ "is Max");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println(b+ "is Max");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println(c+ "is Max");
		}
		else if(d>a && d>b && d>c)
		{
			System.out.println(d+ "is Max");
		}
		else if(a==b && a>c && a>d)
		{
			System.out.println(a+ "and  "+b+" equals and Max");
		}
		else if(c==a && c>b && c>d)
		{
			System.out.println(c+ "and "+a+" equals and max" );
		}
		else if(d==a && d>b && d>c)
		{
			System.out.println(d+ "and "+a+" equals and max");
		}
		else if(c==b && c>a && c>d)
		{
			System.out.println(c+ "and "+b+" equals and max");
		}
		else if(d==b && d>a && d>c)
		{
			System.out.println(d+ "and "+b+" equals and max");
		}
		else if(a>c && a==c && a>d)
		{
			System.out.println(d+ "and "+b+" equals and max");
		}
	}

}

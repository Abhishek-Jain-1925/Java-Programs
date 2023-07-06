package if_else_and_if_else_ladder;

import java.util.Scanner;

public class Min_3no
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 3  number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b&&a<c)
		{
		System.out.println(a +" is min");
		}
		else if(b<a&&b<c)
		{
		System.out.println(b +" is min");
		}
		else if(c<a && c<b)
		{
			System.out.println(c +" is min");
		}
		else if(a==b && a<c)
		{
			System.out.println(a +" and "+b+" is min & equals");
		}
		else if(a==c && c<b)
		{
			System.out.println(a +" and "+c+" is min & equals");
		}
		else if(c==b && b<a)
		{
			System.out.println(c +" and "+b+" is min & equals");
		}
		else
		{
			System.out.println("All are equals");
		}
		
	}

}

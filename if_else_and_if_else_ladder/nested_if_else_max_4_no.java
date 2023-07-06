package if_else_and_if_else_ladder;

import java.util.*;
public class nested_if_else_max_4_no
{
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr your numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			if(a>d)
			{
				System.out.println("Max=" +a);
			}
			else
			{
				System.out.println("Max=" +d);
			}
		}
		else
		{
			System.out.println("Max=" +c);
		}
	}
	else if(b>a)
	{
		if(b>c)
		{
			if(b>d)
			{
				System.out.println("Max=" +b);
			}
			else
			{
				System.out.println("Max=" +d);
			}
		}
		else
		{
			System.out.println("Max=" +c);
		}
	}
	else if(c>a)
	{
		if(c>b)
		{
			if(c>d)
			{
				System.out.println("Max=" +c); 
			}
			else
			{
				System.out.println("Max=" +d);
			}
		}
		else
		{
			System.out.println("Max=" +a);
		}
	}
	else if(d>a)
	{
		if(d>b)
		{
			if(d>c)
			{
				System.out.println("Max=" +d);
			}
			else
			{
				System.out.println("Max=" +c);
			}
		}
		else
		{
			System.out.println("Max=" +b);
			
		}
	}
	else
	{
		System.out.println("4 No. Are Equals");
	}
}
}
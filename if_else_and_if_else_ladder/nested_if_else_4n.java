package if_else_and_if_else_ladder;

import java.util.Scanner;

public class nested_if_else_4n
{
	public static void main(String args[])
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
			if(b>a)
			{
				if(d>a)
				{
					System.out.println("Max=" +d);
				}
				else
				{
					System.out.println("Max=" +a);
				}
			}
			else
			{
				System.out.println("Max=" +b);
			}
		}
		else if(a>c)
		{
			if(b>c)
			{
				if(d>b)
				{
					
				}
				else
				{
					
				}
			}
			else
			{
				
			}
		}
		else if(a>d)
		{
			if(b>d)
			{
				if(d>c)
				{
					
				}
				else
				{
					
				}
			}
			else
			{
				
			}
		}
	}
}

package Nested_if_else;

import java.util.Scanner;

public class nes_if_else_min_3_no 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number a, b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("Min=" +a);
			}
			else
			{
				System.out.println("Min=" +c);
			}
		}
		else if(b<a)
		{
			if(b<c)
			{
				System.out.println("Min=" +b);
			}
			else
			{
				System.out.println("Min=" +c);
			}
		}
		else
		{
			System.out.println("Min=" +c);
		}

	}

}

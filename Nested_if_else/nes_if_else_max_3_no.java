package Nested_if_else;

import java.util.*;
public class nes_if_else_max_3_no {

	public static void main(String[] args) 
	{
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Max=" +a);
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
				System.out.println("Max=" +b);
			}
			else
			{
				System.out.println("Max=" +c);
			}
		}
		else
		{
			System.out.println("Max=" +c);
		}
	}

}

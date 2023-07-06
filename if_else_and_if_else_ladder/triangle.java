package if_else_and_if_else_ladder;
/* Write a program to read three sides a,b,c of a triangle and print the type of the triangle? 
Right angled triangle(a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b)
Equilateral triangle(a==b) && (b==c)
Isosceles triangle(a==b) || (b==c) || (c==a) Scalene(a!=b&&b1=c && c!=a)*/

import java.util.Scanner;

public class triangle 
{
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a , b ,c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b))
		{
			System.out.println("Right Angle Triangle");
		}
		else if((a==b) && (b==c))
		{
			System.out.println("Equilateral triangle");
		}
		else if((a==b) || (b==c) || (c==a))
		{
			System.out.println("Isosceles triangle");
		}
		else if((a!=b&& b!=c && c!=a))
		{
			System.out.println("Scalene");
		}
		else
		{
			System.out.println("Not Triangle");
		}
	}
}

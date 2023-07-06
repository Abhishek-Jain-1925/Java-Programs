package if_else_and_if_else_ladder;

import java.util.*;
public class graph{

	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2  number");
		x=sc.nextInt();
		y=sc.nextInt();	
		if(x>0&&y>0)
		{
			System.out.println(x+" and "+y+" are Quadrant 1");
		}
		else if(x<0&&y>0)
		{
			System.out.println(x+" and "+y+" are Quadrant 2");
		}
		else if(x<0&&y<0)
		{
			System.out.println(x+" and "+y+" are Quadrant 3");
		}
		else if(x>0&&y<0)
		{
			System.out.println(x+" and "+y+" are Quadrant 4");
		}
		else if(x>0&&y==0)
		{
			System.out.println(x+" is on +x axis");
		}
		else if(x<0&&y==0)
		{
			System.out.println(x+" is on -x axis");
		}
		else if(x==0&&y>0)
		{
			System.out.println(x+" is on +y axis");
		}
		else if(x==0&&y<0)
		{
			System.out.println(x+" is on -y axis");
		}

		else 
		{
			System.out.println(x+" and "+y+" are on origin");
		}
	}

}
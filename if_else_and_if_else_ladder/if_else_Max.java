package if_else_and_if_else_ladder;

import java.util.*;
public class if_else_Max {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Max=" +a);
		}
		else if(b>a)
		{
			System.out.println("Max=" +b);
		}
		else
		{
			System.out.println("Both Numbers Are Equals");
		}
	}

}

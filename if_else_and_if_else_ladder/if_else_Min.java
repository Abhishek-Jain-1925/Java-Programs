package if_else_and_if_else_ladder;

import java.util.Scanner;

public class if_else_Min {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b)
		{
			System.out.println("Min=" +a);
		}
		else if(b<a)
		{
			System.out.println("Min=" +b);
		}
		else
		{
			System.out.println("Both Numbers Are Equal");
		}
	}

}

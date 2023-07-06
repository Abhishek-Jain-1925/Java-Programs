package Class_and_object;

import java.util.Scanner;

class maxDemo
{
	int a,b,Max;
	void maxAccept(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int maxDisplay()
	{
		if(a>b)
		{
			System.out.println("Max= "+a);
		}
		else
		{
			System.out.println("Max= "+b);
		}
		return Max;
	}
}

public class Max2 
{

	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		maxDemo m=new maxDemo();
		System.out.println("Enter Value of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		m.maxAccept(a, b);
		int m1=m.maxDisplay();
		System.out.println(" "+m1);
		
	}

}

package Class_and_object;

import java.util.Scanner;

class AreaDemo
{
	double r,A;
	void areaAccept(double r)
	{
		this.r=r;      // 
	}
	double areaDisplay()
	{
		A=3.14*r*r;
		return (A);
	}
}
public class Area
{

	public static void main(String[] args)
	{
		double r,A;
		Scanner sc=new Scanner(System.in);
		AreaDemo a1=new AreaDemo();
		System.out.println("Enter Value Of r");
		r=sc.nextDouble();
		a1.areaAccept(r);
		A=a1.areaDisplay();
		System.out.println("Area= "+A);
		
		
	}

}

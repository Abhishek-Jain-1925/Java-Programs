package Fuctions;

import java.util.Scanner;

public class No_para_no_return_3rd_prog
{
	static void areaOfCircle()
	{
		System.out.println("....AREA OF CIRCLE");
		double r,AC;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value of r");
		r=sc.nextDouble();
		AC=3.14*r*r;
		System.out.println("Area Of Circle=" +AC);
	}
	static void potentialEnergy()
	{
		System.out.println("\n\n....POTENTIAL ENERGY....");
		double mass,gf,heights,PE;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of Mass,gravitational field,heights");
		mass=sc.nextDouble();
		gf=sc.nextDouble();
		heights=sc.nextDouble();
		PE=mass*gf*heights;
		System.out.println("Value of Potential Energy=" +PE);
	}
	static void AM_HM()
	{
		System.out.println("....Arithmatic Mean & Harmonic Mean");
		double a,c,AM,HM;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a and b");
		a=sc.nextDouble();
		c=sc.nextDouble();
		AM=(a+c)/2;
		HM=(a-c)/2;
		System.out.println("Arithmatic Mean=" +AM);
		System.out.println("Harmonic Mean=" +HM);
	}
	public static void main(String[] args) 
	{
		areaOfCircle();
		potentialEnergy();
		AM_HM();
	}

}

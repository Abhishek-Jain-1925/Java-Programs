package SY;

import java.util.Scanner;

public class SYMarks
{
	
	public int SYMarksTotal;
	public double Advance_Java,Maths,Electronics;
	
	public void SYMarksAccept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Advance Java Marks");
		Advance_Java=sc.nextDouble();
		System.out.println("Enter Maths Marks");
		Maths=sc.nextDouble();
		System.out.println("Enter Electronics Marks");
		Electronics=sc.nextDouble();
	}
	
//	public void SYMarksDisplay()
//	{
//		System.out.println("Advance Java= "+Advance_Java);
//		System.out.println("Maths= "+Maths);
//		System.out.println("Electronics= "+Electronics);
//	}
	
	public void SYMarksTotal()
	{
		double Total = Advance_Java + Maths + Electronics;
	}
	
	public void SYMarksTotalDisp()
	{
		String Total = null;
		System.out.println("Total= "+Total);
	}
	
}

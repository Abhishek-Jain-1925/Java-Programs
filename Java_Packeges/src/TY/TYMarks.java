package TY;

import java.util.Scanner;

public class TYMarks
{
	public int TYMarksTotal;
	public double Comp_Network,Web_Devlp;
	
	
	public void TYMarksAccept()
	{
		System.out.println("-----Third Year Marks----");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Comp_Network Marks");
		Comp_Network=sc.nextDouble();
		System.out.println("Enter Web Devlopment Marks");
		Web_Devlp=sc.nextDouble();
	}
	
//	void SYMarksDisplay()
//	{
//		System.out.println("Computer_Network= "+Comp_Network);
//		System.out.println("Web Devlopment= "+Web_Devlp);
//
//	}
//	
	public void TYMarksTotal()
	{
		double Total = Comp_Network + Web_Devlp;
	}
	
	public void TYMarksTotalDisp()
	{
		String Total = null;
		System.out.println("Total= "+Total);
	}
}

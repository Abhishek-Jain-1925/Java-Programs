package Student;

import java.util.Scanner;

import SY.SYMarks;
import TY.TYMarks;

public class Student
{
	public int roll_no;
	public String Name;
//	double SYT,TYT;
//	public double SY_TY_T;
//	String Grade;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No");
		roll_no=sc.nextInt();
		System.out.println("Enter Name");
		Name=sc.next();
	}
	
	
}

//public class Student
//{
//	public static void main(String[] args)
//	{
//			int n,i;
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter The No. Of Student");
//			n=sc.nextInt();
//			SYMarks S[]=new SYMarks[n];
//			TYMarks T[]=new TYMarks[n];
//			StudentInfo SI[]=new StudentInfo[n];
//			for(i=0;i<n;i++)
//			{
//				SI[i]=new StudentInfo();
//				S[i]=new SYMarks();
//				T[i]=new TYMarks();
//				
//				
//				
//				SI[i].accept();
//				S[i].SYMarksAccept();
//				T[i].TYMarksAccept();
//				
//				
//				
//			}
//	}
		
//}



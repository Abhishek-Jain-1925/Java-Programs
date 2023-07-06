package StudentResult;

import java.util.Scanner;

import SY.SYMarks;
import Student.Student;
import TY.TYMarks;

public class StudentResult
{

	public static void main(String[] args)
	{
		int n,i;
		double SYT,TYT,SY_TY_T = 0,per = 0;
		String grade = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No. Of Student");
		n=sc.nextInt();
		SYMarks S[]=new SYMarks[n];
		TYMarks T[]=new TYMarks[n];
		Student SI[]=new Student[n];
		for(i=0;i<n;i++)
		{
			SI[i]=new Student();
			S[i]=new SYMarks();
			T[i]=new TYMarks();
			
			SI[i].accept();
			S[i].SYMarksAccept();
			S[i].SYMarksTotal();
//			S[i].SYMarksTotalDisp();
			
			T[i].TYMarksAccept();
			T[i].TYMarksTotal();
//			T[i].TYMarksTotalDisp();
			
			SY_TY_T=S[i].SYMarksTotal+T[i].TYMarksTotal;
			per=(SY_TY_T/5)*100;
			
			System.out.println("SY_and_TY_Total= "+SY_TY_T);
			System.out.println("SY_and_TY_Per= "+per);
			
			if(per>=70)
				System.out.println("A"); 
			 else if(per>=60)
				 System.out.println("B");
			 else if(per>=50)
				 System.out.println("C"); 
			 else if(per>=40)
				 System.out.println("Pass");
			 else 
				 System.out.println("Fail");
		}
			System.out.println("Roll No\tName\tSyTotal\tTyTotal\tSY_TY_Total\tPercentage\tGrade");
		 for(i=0;i<n;i++)
		 {
		 System.out.println(SI[i].roll_no+"\t"+SI[i].Name+"\t"+S[i].SYMarksTotal+"\t"+T[i].TYMarksTotal+"\t"+SY_TY_T+"\t\t"+per+"\t\t"+grade);
		  
		 }
	}

}

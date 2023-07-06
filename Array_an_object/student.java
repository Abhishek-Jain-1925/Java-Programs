package Array_an_object;

import java.util.Scanner;

public class student
{
	int rNum;
	String Name;
	double Per;
		void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Value of Roll Num. , Name , Percentsge");
			rNum=sc.nextInt();
			Name=sc.next();
			Per = sc.nextDouble();
		}
		void display()
		{
			System.out.println("Roll Number= "+rNum);
			System.out.println("Name= "+Name);
			System.out.println("percentage= "+Per);
		}
}

class stud
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		student s1[]=new student[n];
		for(i=0;i<n;i++)
		{
			s1[i]=new student();
			s1[i].accept();
			s1[i].display();
		}
		
		
	}
}




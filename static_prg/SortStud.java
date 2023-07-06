package static_prg;

import java.util.*;
class Student
{
	int rno;
	String name;
	float per;
	static int cnt=0;
	Student()//default constructor
	{
		rno=0;
		name="ABC";
		per=0.0F;
		cnt++;
	}
	Student(int rno,String name,int per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
		cnt++;
	}
	
	void Display()
	{
		System.out.println("Roll No : "+rno+" Name : "+name+"Percentage : "+per);
	}
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll No : ");
		rno=sc.nextInt();
		System.out.println("Name : ");
		name=sc.next();
		System.out.println("Percentage : ");
		per=sc.nextFloat();
	}
	
	static void sortStud(Student[] D)
	{
	int i,j;
	Student temp;
	for(i=0;i<cnt;i++)
        {
		for(j=i+1;j<cnt;j++)
        	{
			if(D[i].per>D[j].per)
			{
			temp=D[i];
			D[i]=D[j];
			D[j]=temp;
			}
		}
	}
	}
}
	
	class SortStud
	{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Students ? :");
		int tot=sc.nextInt();
		int i;
		Student []D=new Student[tot];//array
		for(i=0;i<tot;i++)
		{
		D[i]=new Student();//object
		D[i].accept();
		}
		for(i=0;i<tot;i++)
                		{
		D[i].Display();
		}
		Student.sortStud(D);
		System.out.println("After Sorting");
		for(int i1=0;i1<tot;i1++)
		{
	        D[i1].Display();
		}
	}
	
}


package Exception_Programs;

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {

	@Override
	public String toString() {
		return "Age is Not Within";
	}

}

class NameNotValidException extends Exception {

	@Override
	public String toString() {
		return "Name Is InValid";
	}

}

class Student {
	int roll_no, age;
	String Name, Course;

	Student(int roll_no, int age, String Name, String Course) {
		this.roll_no = roll_no;
		this.age = age;
		this.Name = Name;
		this.Course = Course;
	}

	void Display() {
		System.out.println("Roll No.= " + roll_no);
		System.out.println("Age= " + age);
		System.out.println("Name " + Name);
		System.out.println("Course= " + Course);
	}

}

public class UserDefine3 {

	public static void main(String[] args) 
	{
		int roll_no,age;
		String s1 = null;
		String Name,Course;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No");
		roll_no=sc.nextInt();
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enetr Name");
		Name=sc.next();
		System.out.println("Enetr Course");
		Course=sc.next();
		try
		{
			if(age>=15 && age<=21)
			{
			         int cnt = 0;
					for(int i=0;i<Name.length();i++)
					{
						
						char ch=s1.charAt(i);
						if(Character.isLetter(ch))
						{
							cnt++;
						}
						else
						{
							throw new NameNotValidException ();
						}
					}
			
					if(cnt==Name.length())
					{
						Student s11=new Student(roll_no,age,Name,Course);
						s11.Display();		
			        }
					else
					{
						throw new AgeNotWithinRangeException();
					}
			}
		}

	catch(AgeNotWithinRangeException e)
	{
		System.out.println(e);
	}

	catch(NameNotValidException e1)
	{
		System.out.println(e1);
	}
}

}


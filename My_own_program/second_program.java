package My_own_program;
/*Ask user to enter age, sex (M or F ), marital status ( Y or N ) and then using following rules print their place of service.
 if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 to 60 then he will work in urban areas only.
And any other input of age should print "ERROR".*/

import java.util.*;
public class second_program {

	

	public static void main(String[] args) 
	{
		int age;
		String Sex,Marital_status,Female="",Male="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		System.out.println("Enter Your Gender");
		Sex=sc.next();
//		System.out.println("Enter Your Marital Status");
//		Marital_status=sc.next();
		if(Sex==Male)
		{
			if(age>=20 && age<=40)
			{
				System.out.println("You Work In Anywhere");
			}
			else if(age>=40 && age<=60)
			{
				System.out.println("You Work In Urban Areas Only");
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		else if(Sex==Female)
		{
			System.out.println("......................");
			System.out.println("You Work Only Urban Area");
		}
		else
		{
			System.out.println(".................");
			System.out.println("ERROR");
		}
		
		
	}

}

package Class_and_object;

import java.util.Scanner;

class vehicleDemo
{
	int vNum;
	String vname,vcompany,colour,owner;
	double price;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Vehicle Number");
		vNum=sc.nextInt();
		System.out.println("Enter Vehicle Name");
		vname=sc.next();
		System.out.println("Enter Company Name");
		vcompany=sc.next();
		System.out.println("Enter Vehicle Colour");
		colour=sc.next();
		System.out.println("Enter Owner Name");
		owner=sc.next();
		System.out.println("Enter Vehicle Price");
		price=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Vehicle Number= "+vNum);
		System.out.println("Vehicle Name= "+vname);
		System.out.println("Company Name= "+vcompany);
		System.out.println("Vehicle Colour= "+colour);
		System.out.println("Owner Name= "+owner);
		System.out.println("Vehicle Price= "+price);
	}
	
}
public class vehicle
{
	public static void main(String[] args)
	{
		vehicleDemo v=new vehicleDemo();
		v.accept();
		v.display();
	}
}

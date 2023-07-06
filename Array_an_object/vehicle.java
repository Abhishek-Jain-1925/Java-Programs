package Array_an_object;

import java.util.Scanner;

class vehicleDemo
{
	int vNum,vPrice;
	String vName,comp_Name,vColor,ownerName;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of Vehicle Number , Name , Company Name , Color , Owner Name , Price");
		vNum=sc.nextInt();
		vName=sc.next();
		comp_Name=sc.next();
		vColor=sc.next();
		ownerName=sc.next();
		vPrice=sc.nextInt();
	}
	void display()
	{
		System.out.println("Vehicle Number= "+vNum);
		System.out.println("Name= "+vName);
		System.out.println("Company Name= "+comp_Name);
		System.out.println("Color= "+vColor);
		System.out.println("Owner Name= "+ownerName);
		System.out.println("Price= "+vPrice);
	}
}
public class vehicle 
{

	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num. of Vehicle");
		n=sc.nextInt();
		vehicleDemo v[]=new vehicleDemo[n];
		for(i=0;i<n;i++)
		{
			v[i]=new vehicleDemo();
			v[i].accept();
			v[i].display();
		}
	}

}

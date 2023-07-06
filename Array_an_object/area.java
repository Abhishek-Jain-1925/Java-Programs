package Array_an_object;

import java.util.Scanner;

class areaDemo
{
	double r,A;
	void accept(double r)
	{
		this.r=r;
	}
	
	double  display()
	{
		A=3.14*r*r;
		return (A);
		
	}
}
public class area
{

	public static void main(String[] args)
	{
		double r;
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Records");
		n=sc.nextInt();
		areaDemo a[]=new areaDemo[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=new areaDemo();
			System.out.println("Enter Value of r");
			r=sc.nextDouble();
			a[i].accept(r);
			System.out.println("ARAE= "+a[i].display());
		}
	}

}

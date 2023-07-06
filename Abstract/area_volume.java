package Abstract;

import java.util.*;


abstract class area_vol
{
	abstract void cal_area();
	abstract void cal_vol();
}


class circle1 extends area_vol
{
	double r,A,V; 

	circle1(double r) 
	{
		this.r=r;
	}
		void cal_area()
		{
			A=3.14*r*r;
			System.out.println("Area of Circle= "+A);
		}
		void cal_vol()
		{
			V=(4/3)*3.14*r*r*r;
			System.out.println("volume of circle= "+V);
		}
}


class cone extends area_vol
{
	double r,h,A,V; 

	cone(double r,double h) 
	{
		this.r=r;this.h=h;
	}
		void cal_area()
		{
			A=(1/3)*3.14*r*r*h;
			System.out.println("Area of cone= "+A);
		}
		void cal_vol()
		{
			V=1/3*3.14*r*r*h;
			System.out.println("volume of cone= "+V);
		}
}




class cylinder extends area_vol
{
	double r,h,A,V;
	cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	
	void cal_area()
	{
		
		A=(2*3.14*r*h) + (2*3.14*r*r);
		System.out.println("Area of cylinder="+A);
	}

	
	void cal_vol()
	{
		V=3.14*r*r*h;
		System.out.println("Volume of cylinder="+V);
	}
	
}


class sphere extends area_vol
{
	double r,A,V;
	sphere(double r)
	{
		this.r=r;
		
	}
	
	void cal_area()
	{
		
		A=4*3.14*r*r;
		System.out.println("Area of sphere="+A);
	}

	
	void cal_vol()
	{
		V=(4/3)*(3.14)*r*r;
		System.out.println("Volume of sphere="+V);
	}
	
}

class box extends area_vol
{
	double l,w,h,A,V;
	box(double l,double w,double h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	
	void cal_area()
	{
		
		A=2*(l*w + l*h + h*w);
		System.out.println("Area of box="+A);
	}

	
	void cal_vol()
	{
		V=l*w*h;
		System.out.println("Volume of box="+V);
	}
	
}



public class area_volume
{

	public static void main(String[] args) 
	{
		Double r,h,l,w;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter r");
		r=sc.nextDouble();
		circle1 c1=new circle1(r);
		c1.cal_area();
		c1.cal_vol();
		
		
		System.out.println("enter h");
		h=sc.nextDouble();
		cone c2=new cone(r,h);
		c2.cal_area();
		c2.cal_vol();

		
		
		cylinder c3=new cylinder(r,h);
		c3.cal_area();
		c3.cal_vol();
		
		sphere s=new sphere(r);
		s.cal_area();
		s.cal_vol();
		
		System.out.println("enter length");
		l=sc.nextDouble();
		System.out.println("enter width");
		w=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		box b=new box(l,w,h);
		b.cal_area();
		b.cal_vol();

	}

}


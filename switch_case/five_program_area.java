package switch_case;

import java.util.Scanner;

public class five_program_area 
{

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Area Of Circle\n2.Area Of Rectangle\n3.Area Of Triangle\n4.Kinetic Energy\n5.Potential Energy\n6.Arithmatic Mean and Harmonic Maean");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				double r,AC;
				System.out.println("Enter a Value of r");
				r=sc.nextDouble();
				AC=3.14*r*r;
				System.out.println("Area Of Circle=" +AC);
				break;
			case 2:
				double l,b,AR;
				System.out.println("Enter a Value Of l,b");
				l=sc.nextDouble();
				b=sc.nextDouble();
				AR=l*b;
				System.out.println("Area Of Rectangle=" +AR);
				break;
			case 3:
				double breadth,height,AT;
				System.out.println("Enter a Value Of breadth and height");
				breadth=sc.nextDouble();
				height=sc.nextDouble();
				AT=1/5*breadth*height;
				System.out.println("Area Of Triangle=" +AT);
				break;
			case 4:
				double m,v,KE;
				System.out.println("Enter a Value Of m & v");
				m=sc.nextDouble();
				v=sc.nextDouble();
				KE=1/5*m*v*v;
				System.out.println("Value of Kinetic Energy=" +KE);
				break;
			case 5:
				double mass,gf,heights,PE;
				System.out.println("Enter Value of Mass,gravitational field,heights");
				mass=sc.nextDouble();
				gf=sc.nextDouble();
				heights=sc.nextDouble();
				PE=mass*gf*heights;
				System.out.println("Value of Potential Energy=" +PE);
				break;
			case 6:
				double a,c,AM,HM;
				System.out.println("Enter Value of a and b");
				a=sc.nextDouble();
				c=sc.nextDouble();
				AM=(a+c)/2;
				HM=(a-c)/2;
				System.out.println("Arithmatic Mean=" +AM);
				System.out.println("Harmonic Mean=" +HM);
				break;
			case 7:
				System.out.println(0);
				break;
					default: 
					System.out.println("Invalid Choice");
					
			}
		}while(ch<=6);
	}

}

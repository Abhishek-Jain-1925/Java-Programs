package Fuctions;

import java.util.Scanner;

public class No_para_no_return_4th_program
{
	static void swapTwoNum()
	{
		System.out.println("Swapping Two Numbers");
		int a = 0,b = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a+ " b=" +b);
	}
	
	static void weekShow()
	{
		System.out.println("\n\n Week Show Program");
		int day;
		String dayString = null,daytype = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Choice");
		day=sc.nextInt();
		
			switch(day)
			{
				case 1:
					dayString="Monday"; daytype="Weekday";
					break;
				case 2:
					dayString="Tuesday"; daytype="Weekday";
					break;
				case 3:
					dayString="Wednesday"; daytype="Weekday";
					break;
				case 4:
					dayString="Thursday"; daytype="Weekday";
					break;
				case 5:
					dayString="Friday"; daytype="Weekday";
					break;
				case 6:
					dayString="Saturday"; daytype="Weekend";
					break;
				case 7:
					dayString="sunday"; daytype="Weekend";
					break;
				case 8:
					System.out.println(0);
					break;
					default:dayString="Invalid choice";
					
			}
		System.out.println(dayString + " is a " + daytype);
	}
	static void armstrongNum()
	{
		System.out.println("....Armstrong Number....");
		int n,n1,sum=0,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		p=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=sum+(n1*n1*n1);
		}
		if(p==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
	static void desendingNum()
	{
		System.out.println("\n\n....Number Desending Order Print");
		int i,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			System.out.println(" "+i);
		}
	}
	public static void main(String[] args)
	{
		swapTwoNum();
		weekShow();
		desendingNum();
		
	}

}

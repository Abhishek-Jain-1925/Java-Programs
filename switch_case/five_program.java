package switch_case;

import java.util.Scanner;

public class five_program {

	public static void main(String[] args) 
	{
		int a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		do
		{
			System.out.println("1.Addition of 2 no.\n2. Swaping Two Numbers\n3. Max 2 no.\4 Min 2 no\n5.Exit");
			System.out.println("Enter Your Chice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Add="+(a+b));
				break;
			case 2:
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("a=" +a+ "b=" +b);
				break;
			case 3:
				if(a>b)
				{
					System.out.println("Max=" +a);
				}
				else if(b>a)
				{
					System.out.println("Max=" +b);
				}
				else
				{
					System.out.println("Both Are Equals");
				}
			case 4:
				if(a<b)
				{
					System.out.println("Min=" +a);
				}
				else if(b<a)
				{
					System.out.println("Min=" +b);
				}
				else
				{
					System.out.println("Both Are Equals");
				}
			case 5:
				System.out.println(0);
				break;
				default:
					System.out.println("Invalid Case");
			}
		}
		while(ch<=5);
		
	}

}

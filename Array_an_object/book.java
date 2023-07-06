package Array_an_object;

import java.util.Scanner;

class bookDemo
{
	int BId,Bprice;
	String BName,Bauthor;
	
	void bookAccept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Id , Name , author , price");
		BId=sc.nextInt();
		BName=sc.next();
		Bauthor=sc.next();
		Bprice=sc.nextInt();
	}
	
	void bookDisplay()
	{
		System.out.println("Book Id= "+BId);
		System.out.println("Book Name= "+BName);
		System.out.println("Book Author= "+Bauthor);
		System.out.println("Book Price= "+Bprice);
	}
	
}

public class book
{

	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Book");
		n=sc.nextInt();
		bookDemo b[]=new bookDemo[n];
		for(i=0;i<n;i++)
		{
			b[i]=new bookDemo();
			b[i].bookAccept();
			b[i].bookDisplay();
		}
	}

}

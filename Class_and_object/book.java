package Class_and_object;

import java.util.Scanner;

public class book 
{
	int Bid,Bprice;
	String Bname,Bauthor;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of Book id");
		Bid=sc.nextInt();
		System.out.println("Enter Value of Book price");
		Bprice=sc.nextInt();
		System.out.println("Enter Book name");
		Bname=sc.next();
		System.out.println("Enter Book author Name");
		Bauthor=sc.next();
	}
	
	void display()
	{
		System.out.println("Book Id= "+Bid);
		System.out.println("Book Price= "+Bprice);
		System.out.println("Book Name= "+Bname);
		System.out.println("Book Author= "+Bauthor);
	}
}

class book1
{

	public static void main(String[] args)
	{
		book first=new book();
		first.accept();
		first.display();
		
	}
}

package default_Constructor;

class book_demo
{
	int bid;
	String bname,author;
	double price;
	book_demo()
	{
		bid=101;
		bname="Getting Inside In Java";
		author="Prem Kumar";
		price=267;
	}
	void display()
	{
		System.out.println("Bid="+bid);
		System.out.println("Bname="+bname);
		System.out.println("Book Author="+author);
		System.out.println("Price="+price);
	}
	
}

public class book
{

	public static void main(String[] args)
	{
		book_demo b=new book_demo();
		b.display();
	}

}

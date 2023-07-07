abstract class abc
{
	static int b =10;
	static void hello()
	{
		System.out.println("\n\t Hello World..!");
	}
}

class xyz extends abc
{
	int a=20;
	void value(){
	System.out.println("\n\t Value of A = "+a);}
}

class abstractDemo
{
	static void print()
	{
		System.out.println("\n\t Hello World from print..!");
	}
	public static void main(String args[])
	{
		xyz c1 = new xyz();
		print();
		//abc.hello();
		System.out.println("\n\t Value of B : "+abc.b);
		c1.hello();
		c1.value();
	}
}
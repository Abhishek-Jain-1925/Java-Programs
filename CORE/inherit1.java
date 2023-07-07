class in
{
	protected int b = 500;
}
class inherits extends in
{
	protected int bal=100;
}
class inherit1 extends inherits
{
			private int a=10;

	void hello()
	{
		
		System.out.println("\n\t Hello from Hustlers.");
	}
	
	public static void main(String asdb[])
	{
		inherit1 in = new inherit1();
		in.hello();
		System.out.println("\n\t Value of A = "+in.a);
		System.out.println("\n\t Value of Balance = "+in.bal);
		System.out.println("\n\t Value of B = "+in.b);
	}
}
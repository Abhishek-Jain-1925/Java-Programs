class test
{
	private int a=10;
	private String name;
	void print()
	{
		System.out.println("\n\t Hello Printed...! from Test and A = "+a);
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
}


class encap
{
	void print()
	{
		System.out.println("\n\t Hello Printed...! from Encap");
	}
	
	public static void main(String asdb[])
	{
		test t = new test();
		t.print();
		t.setName("ABhi");
		System.out.println(t.getName());
		encap e = new encap();
		e.print();
	}
}
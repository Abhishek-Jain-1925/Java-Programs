class xyz
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class demo 
{
	public static void main(String args[])
	{
		xyz x = new xyz();
		System.out.println(x.add(10,20));
	}
}

abstract class abc
{
	public abstract void run()
	{
		System.out.println("Running...");
	}
}

class xyz extends abc{
	
}
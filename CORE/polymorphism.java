//RunTime PolyMorphism

class bike
{
	void run()
	{
		System.out.println("\n\t Running....!");
	}
}
//here polymorphism is basically named as Splender in example but due to class name we are changed it.
class polymorphism extends bike
{
	void run()
	{
		System.out.println("\n\t Running Safely at 60 KM/H");
	}
	
	public static void main(String asdb[])
	{
		bike b = new polymorphism();
		b.run();
	}
}
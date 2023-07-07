class garbageCollectorDemo
{
	public static void main(String args[])
	{
		long a,b;
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("\n\t Total JVM Memory : "+rt.totalMemory());
		a=rt.freeMemory();
		System.out.println("\n\t Free Memory Before GC : "+a);
		
		rt.gc();
		
		b=rt.freeMemory();
		System.out.println("\n\t Free Memory After GC : "+b);
		System.out.println("\n\t Total Free Memory : "+(b-a));
	}
}
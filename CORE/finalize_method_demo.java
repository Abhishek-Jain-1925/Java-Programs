class demo
{
	int a;
	demo()
	{
		a=0;
		System.out.println("\n\t I am in Def. con_or");
	}
	demo(int a )
	{
		this.a=a;
		System.out.println("\n\t I am in Para. con_or");
		System.out.println("\n\t A : "+a);
	}
	//overridden method from object class i.e.Sabka Malik Ek
	protected void finalize()
	{
		System.out.println("\n\t Object Destroyed !!");
	}
}

class finalize_method_demo
{
	public static void main(String args[])
	{
		demo obj1 = new demo();
		demo obj2 = new demo(25);
		
		obj1=null;		//force garbage collection
		obj2=null;
		
		System.gc();	//invoke garbage collector & it call to finalize() only once
	}
}

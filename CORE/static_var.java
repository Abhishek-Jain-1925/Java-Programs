class demo
{
	protected static int a =10;		//instance variable
		
		static void disp()
		{
			System.out.println("\n\t Inside the Disp() Method");
		}
}

class static_var
{
	static int b=25;		//static variable
	public static void main(String asdb[])
	{
		int c=50;		//local variable
		System.out.println("\n\t Value of A = "+demo.a);
				System.out.println("\n\t Value of B = "+b);
						System.out.println("\n\t Value of C = "+c);
						
		demo m = new demo();
		
		demo.disp(); 		//To access static method => className + methodName
		m.disp(); 			//Also Accessed by object of class
	}
}
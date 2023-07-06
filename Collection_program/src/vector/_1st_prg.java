package vector;

import java.util.Vector;

public class _1st_prg
{

	public static void main(String[] args)
	{
		Vector v = new Vector(3,2);   // initial capacity 3,increment 2
		
		System.out.println("Initial size = " +v.size());
		System.out.println("Initial Capacity = " +v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		System.out.println(v);
		System.out.println("Initial size = " +v.size());
		System.out.println("Initial Capacity = " +v.capacity());
		
		System.out.println("First Element = " +v.firstElement());
		System.out.println("Last Element = " +v.lastElement());
		
		if(v.contains(3))
			System.out.println("Vector Contains 3");
		
		
		
	}

}

package Array_list_prg;

import java.util.ArrayList;
import java.util.Iterator;

public class _1st_prg 
{

	public static void main(String[] args)
	{
		ArrayList al= new ArrayList();
		System.out.println("Initial Size Of ArrayList = " +al.size());
		
		al.add('A');
		al.add('A');
		al.add('V');
		al.add('E');
		al.add('J');
		
		
		// add object on another Method
		
		al.add(1, 'a');
		System.out.println(al);
		System.out.println("After Add Objects In ArrayList " +al.size());
		
		al.remove('E');		// remove by using char
		al.remove(0);		// remove by using index
		System.out.println(al);
		
		System.out.println("Contents of ArrayList Using Iterator: ");
		Iterator I = al.iterator();		// Iterator is a interface, So we can't allocate memory,Use for to print elements one by one
		
		while (I.hasNext()) {
			System.out.println((String)I.next());
			 
		}
		
	}

}

package LinkedList;

import java.util.LinkedList;

public class _1st_prg
{

	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		
		ll.add('A');
		ll.add('A');
		ll.add('V');
		ll.add('E');
		ll.add('J');
		
		System.out.println(ll);
		
		ll.addFirst('a');
		ll.addLast('j');
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		// get and set value
		
		Object obj = ll.get(2);
		ll.set(2, "new Value");
		
		System.out.println(ll);
		
	}

}

package String_Programs;

public class StringBuffer_prg
{

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("sb= " +sb);
		
		StringBuffer sb1=new StringBuffer("Java");
		System.out.println("sb2= " +sb1.length());   // Find String length
		System.out.println("sb2= " +sb1.capacity()); // By Default 16 Char Memory Allocated
		
		
		StringBuffer sb2=new StringBuffer("Program");
		sb1.append(sb2);								// To Change The String
		System.out.println(sb1);
		
		sb1.insert(0, "Simple");
		System.out.println(sb1);
		
		sb1.delete(0, 6);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		
		
		
	}

}
 
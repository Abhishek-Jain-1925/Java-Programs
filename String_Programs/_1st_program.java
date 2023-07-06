package String_Programs;

public class _1st_program
{

	public static void main(String[] args)
	{
		String s1=new String();  // empty String
		System.out.println("S1 = "+s1);
		
		char array[]= {'a','a','v','e','j'};
		String s2=new String(array);
		System.out.println("S2 = "+s2);
		
		String s3=new String(s2);     //  String S2 Copy To String S3
		if(s2==s3)
		System.out.println("S2 and S3 Are Same References");
		if(s2.equals(s3))
		System.out.println("S2 and S3 Are Same Contents");
		
		
		System.out.println(s2+ " starts with a= " +s2.startsWith("a"));
		System.out.println(s2+ " Ends With j= " +s2.endsWith("j"));
		
		
		String s4=new String("This Is Original String");
		System.out.println(s4);
		
		System.out.println("After Replacing String");
		String s5=s4.replace('i', 'a');     // ('old char','new char')
		System.out.println(s5);
	}

}

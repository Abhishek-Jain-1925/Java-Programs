package Class_and_object;

import java.util.Scanner;

class vovelDemo
{
	char ch;
	void vovelAccept(char ch)
	{
		this.ch=ch;
	}
	String vovelDisplay()
	{
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E'  || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			return(ch+ " Is vovel");
		}
		else
		{
			return(ch+ " Is not vovel");
		}		
	}
}
public class vovel
{

	public static void main(String[] args)
	{
		char ch;
		String s;
		Scanner sc=new Scanner(System.in);
		vovelDemo v=new vovelDemo();
		System.out.println("Enter Your Char");
		
		s=sc.next();
		ch=s.charAt(0);
		v.vovelAccept(ch);
		String s1=v.vovelDisplay();
		System.out.println(" "+s1);
		
	}

}

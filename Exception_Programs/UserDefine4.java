package Exception_Programs;

import java.util.Scanner;

class VovelException extends Exception
{

	@Override
	public String toString() 
	{
		return "It Is Vovel";
	}
	
}

class NumberException extends Exception
{

	@Override
	public String toString()
	{
		return "Char Is Number";
	}
	
}

class ExitException extends Exception
{

	@Override
	public String toString() 
	{
		return "Program Is End";
	}
	
}

public class UserDefine4 
{

	public static void main(String[] args) throws VovelException
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Any Character");
		ch=sc.next().charAt(0);
		try
		{
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
					throw new VovelException();
				}
				else if(ch>=0 && ch<=9)
				{
					throw new NumberException();
				}
				else if(ch=='X')
				{
					throw new ExitException();
				}
				else
				{
					System.out.println("Error");
				}
		}
		catch(VovelException e)
		{
			System.out.println(e);
		}
		catch(NumberException e1)
		{
			System.out.println(e1);
		}
		catch(ExitException e2)
		{
			System.out.println(e2);
			System.exit(0);
			
		}
	}

}

package Exception_Programs;

import java.util.Scanner;

class NameException extends Exception
{

	@Override
	public String toString()
	{
		return "Name is Not Valid";
	}
	
}

public class UserDefine2
{

	public static void main(String[] args)
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String s1=sc.next();
		try
		{
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(Character.isLetter(ch))
				{
					cnt++;
				}
				else
				{
					throw new NameException();
				}
			}
		}
		catch(NameException e)
		{
			System.out.println(e);
		}
		if(cnt==s1.length())
		{
			System.out.println("Name Is Valid");
		}

	}

}

package Exception_Programs;

import java.util.Scanner;

class AlphabetException extends Exception
{

	@Override
	public String toString()
	{
		return "Enter Char Is Not An Alphabet";
	}
	
}

class RainBowException extends Exception
{

	@Override
	public String toString()
	{
		return "EROOR....No RainBow Colour";
	}
	
}

public class UserDefine7
{

	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Character");
		ch=sc.next().charAt(0);
		try
		{
			if(ch>='A' && ch<='Z')
			{
				if(ch=='R')
				{
					System.out.println("RED");
				}
				else if(ch=='O')
				{
					System.out.println("Orange");
				}
				else if(ch=='Y')
				{
					System.out.println("Yellow");
				}
				else if(ch=='G')
				{
					System.out.println("Green");
				}
				else if(ch=='B')
				{
					System.out.println("Blue");
				}
				else if(ch=='I')
				{
					System.out.println("Indigo");
				}
				else if(ch=='V')
				{
					System.out.println("Violet");
				}
				else
				{
					throw new RainBowException();
				}
			}
			else
			{
				throw new AlphabetException();
			}
		}
		catch(AlphabetException e)
		{
			System.out.println(e);
		}
		catch(RainBowException e1)
		{
			System.out.println(e1);
		}
	}

}

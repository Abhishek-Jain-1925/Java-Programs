

import java.util.*;

class divisibleBy3OrNot
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter The Number To Check Is it Divisible by 3 : ");
		no = s.nextInt();
		if(no%3==0)
		{
			System.out.println("\n\t"+no+" is Divisible By 3.");
		}
		else
		{
			System.out.println("\n\t"+no+" is Not DIVISIBLE By 3.");
		}
	}
}



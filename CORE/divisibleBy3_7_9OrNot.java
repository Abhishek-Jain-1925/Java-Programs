import java.util.*;
//Here we check Whether our given number is divisible by 3 or 7 or 9.

class divisibleBy3_7_9OrNot
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter The Number To Check Is It Divisible By Any of 3 or 7 or 9 : ");
		no = s.nextInt();
		if(no%3==0 || no%7==0 || no%9==0)
		{
			System.out.println("\n\t"+no+" is Divisible By Any of 3 or 7 or 9.");
		}
		else
		{
			System.out.println("\n\t"+no+" is Not Divisible By Any of 3 or 7 or 9.");
		}
	}
}



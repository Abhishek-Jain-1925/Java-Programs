import java.util.*;

class divisibleBy3_7OrNot
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter The Number To Check Is It Divisible By 3 & 7 : ");
		no = s.nextInt();
		if(no%3==0 && no%7==0)
		{
			System.out.println("\n\t"+no+" is Divisible By 3 & 7.");
		}
		else
		{
			System.out.println("\n\t"+no+" is Not Divisible By 3 & 7.");
		}
	}
}



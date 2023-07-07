import java.util.*;

class divisibleBy3_7OrNot
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter The Number To Check Even Or Odd : ");
		no = s.nextInt();
		if(no%2==0)
		{
			System.out.println("\n\t"+no+" is EVEN.");
		}
		else
		{
			System.out.println("\n\t"+no+" is ODD.");
		}
	}
}



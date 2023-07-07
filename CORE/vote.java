import java.util.*;

class vote
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter Your Age To Check Whether you're Eligible To Vote : ");
		no = s.nextInt();
		if(no >=18)
		{
			System.out.println("\n\t You Are Eligible To Vote");
		}
		else
		{
			System.out.println("\n\t You Are Not Eligible To Vote");
		}
	}
}



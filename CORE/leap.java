import java.util.*;

class leap
{
	public static void main(String[] asdb)
	{
		Scanner s;
		s = new Scanner(System.in);
		int no;
		System.out.println("\n Enter The Year To Check Whether it is Leap or NOT : ");
		no = s.nextInt();
		if(no%4==0)
		{
			System.out.println("\n\t"+no+" is Leap Year.");
		}
		else
		{
			System.out.println("\n\t"+no+" is NOT Leap Year.");
		}
	}
}



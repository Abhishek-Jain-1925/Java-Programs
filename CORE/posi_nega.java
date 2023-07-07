import java.util.*;

class posi_nega
{
	
	public static void main(String[] args)
	{
		Scanner s;
		double no;
		s = new Scanner(System.in);
		System.out.println("\nEnter The Number To check Is it Positive or Negative : ");
		no = s.nextDouble();
		if(no >= 0)
		{
			System.out.println("\n\t"+no+" is a POSITIVE");
		}
		else
		{
			System.out.println("\n\t"+no+" is a NEGATIVE");
		}
		
		if(no == 0)
		{
			System.out.println("\n\t 0 is Nutral Or Positive.");
		}
	}
}




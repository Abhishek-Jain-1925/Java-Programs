import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int i=0,fact=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t Enter The Number for Finding Factorial : ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		
		System.out.println("\n\t Factorial of "+n+" is : "+fact);
	}
}
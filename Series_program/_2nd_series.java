package Series_program;

//sum=1x+3x+5x+7x....
import java.util.Scanner;

public class _2nd_series 
{

	public static void main(String[] args)
	{
		int i,n,x,sum=0,k = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(k*x);
			k=k+2;
		}
		System.out.println("sum="+sum);
		
	}

}

package Series_program;
//1!/1 + 2!/2 + 3!/3 + 4!/4+	+ n!/n
import java.util.Scanner;

public class _5th_series
{

	public static void main(String[] args) 
	{
		int i,k,n,f1;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)//terms
		{
			f1=1;//fact
			for(k=i;k>1;k--)//factorial
			{
				f1=f1*k;
			}
			sum=sum+(double)(f1/i);
		}
		System.out.println("Sum="+sum);
	}
}

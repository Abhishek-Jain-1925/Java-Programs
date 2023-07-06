package Series_program;
// sum=1!/x^1+2!/x^2+3!/x^3+.........
import java.util.Scanner;

public class _3rd_series
{

	public static void main(String[] args)
	{
		int i,j,k,f1,f2,x,n;
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number");
		n=sc.nextInt();
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		for(i=1;i<=n;i++)									//terms
		{
			f1=1;											//fact
			f2=1;											//power
			for(k=i;k>1;k--)								//factorial
			{
				f1=f1*k;
			}
			for(j=1;j<=i;j++)							//power
			{
				f2=f2*x;
			}
			sum=sum+(double)(f1/f2);
		}
		System.out.println("Sum="+sum);

	}

}

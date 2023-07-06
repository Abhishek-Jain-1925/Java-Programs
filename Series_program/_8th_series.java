package Series_program;
//1 + x + x^2/2! + x^3/3! + x^4/4! +	x^n/n!
import java.util.Scanner;

public class _8th_series {

	public static void main(String[] args)
	{
		int i,n,j,x,k,f1,f2;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=1;
			f2=1;
			int f3 = i+x;
			for(j=1;j<=i;j++)							//power
			{
				f1=f1*x;
			}
			for(k=i;k>1;k--)								//factorial
			{
				f2 = f2*k;
			}
			sum=sum+(double)(f3+(f1/f2));
		}
		System.out.println("sum="+sum);
	}

}

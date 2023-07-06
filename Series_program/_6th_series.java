package Series_program;

//sum=x^1+x^2+x^3+....x^n;
import java.util.Scanner;

public class _6th_series {

	public static void main(String[] args) 
	{
		int i,n,j,x,sum=0,f1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		System.out.println("Enter Value of x");
		x=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=1;
			for(j=1;j<=i;j++)
			{
				f1=f1*x;
			}
			sum=sum+f1;
		}
		System.out.println("SUM="+sum);
		
	}

}

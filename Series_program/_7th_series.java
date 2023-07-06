package Series_program;

//sum=1^1+2^2+3^3+....n^n;
import java.util.Scanner;

public class _7th_series {

	public static void main(String[] args) 
	{
		int i,n,j,x,sum=0,f1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
//		System.out.println("Enter Value of x");
//		x=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=1;
			for(j=1;j<=n;j++) 
			{
				f1=f1*i;
			}
			sum=sum+f1;
		}
		System.out.println("SUM="+sum);
		
	}

}

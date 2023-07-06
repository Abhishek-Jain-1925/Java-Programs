package Series_program;

//1! + 2! + 3! + 4!+	+ n!
import java.util.Scanner;

public class _4th_series {

	public static void main(String[] args) 
	{
		int i,k,n,sum=0,f1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=1;
			for(k=i;k>1;k--)
			{
				f1=f1*k;
			}
			sum=sum+f1;
		}
		System.out.println("Sum="+sum);
	}

}

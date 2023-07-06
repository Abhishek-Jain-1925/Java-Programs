package while_loop;

import java.util.Scanner;

public class multi_series {

	public static void main(String[] args)
	{
		int n,n1,n2,multi=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			n2=n%10;
			multi=multi+(n1*n2);
			
		}
		System.out.println("Multiplication="+multi);
	}

}

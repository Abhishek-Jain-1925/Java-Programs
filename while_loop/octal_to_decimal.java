package while_loop;

import java.util.Scanner;

public class octal_to_decimal {

	public static void main(String[] args) 
	{
		int n,n1,sum=0,p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=sum+(n1*p);
			p=p*8;
		}
		System.out.println("Decimal="+sum);
	}

}

package while_loop;

import java.util.Scanner;

public class decimal_to_octal {

	public static void main(String[] args) 
	{
		int n,n1,sum=0,p=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%8;
			n=n/8;
			sum=sum+(n1*p);
			p=p*10;
		}
		System.out.println("Octal="+sum);

	}

}

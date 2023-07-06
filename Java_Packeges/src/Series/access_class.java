package Series;

import java.util.Scanner;

public class access_class 
{

	public static void main(String[] args)
	{
		int n,n1,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array size");
		n1=sc.nextInt();
		
		prime_no p[]=new prime_no[n1];
		fibonacci f[]=new fibonacci[n1];
		armstrong a[]=new armstrong[n1];
		
		for( i=0;i<n1;i++)
		{
			System.out.println("\n ---Prime No----");
			
			
			System.out.println("Enter Number");
			n=sc.nextInt();
			p[i]=new prime_no(n);
			p[i].display();
			
			System.out.println("\n ---fibonacci---");
			System.out.println("Enter Number");
			n=sc.nextInt();
			f[i]=new fibonacci(n);
			f[i].display();
			
			
			System.out.println("\n ---armstrong---");
			System.out.println("Enter Number");
			n=sc.nextInt();
			a[i]=new armstrong(n);
			a[i].display();
		}
	}

}

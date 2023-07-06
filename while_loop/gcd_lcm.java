package while_loop;

import java.util.Scanner;

public class gcd_lcm {

	public static void main(String[] args) 
	{
		int i=1,n,a,b,gcd = 1,lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a");
		a=sc.nextInt();
		System.out.println("Enter Value of b");
		b=sc.nextInt();
		if(a<b)
		{
			n=a;
		}
		else
		{
			n=b;
		}
		while(i<=n)
		{
			i++;
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
			
		}
		lcm=(a*b)/gcd;
		System.out.println("GCD="+gcd+" LCM=" +lcm);
		
		
		
	}

}

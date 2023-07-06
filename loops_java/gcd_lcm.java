package loops_java;

import java.util.Scanner;

public class gcd_lcm 
{

	public static void main(String[] args) 
	{
		int i,n,a,b,gcd = 0,lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b)
		{
			n=a;
		}
		else
		{
			n=b;
		}
		for(i=1;i<=n;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		lcm=(a*b)/gcd;
		System.out.println("LCM=" +lcm+ " GCD=" +gcd);
	}

}

package Class_and_object;

import java.util.Scanner;

class primeDemo
{
	int i,n,div=0;
	void primeAccept(int n)
	{
		this.n=n;
	}
	String primeDisplay()
	{
		for(i=2;i<=(n/2);i++)
		{
			if(n%2==0)
			{
				div=1;
				break;
			}
		}
		if(div==0)
		{
			return("Number Is Prime");
		}
		else
		{
			return("Number Is Not Prime");
		}
	}
}
public class Prime
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		primeDemo p=new primeDemo();
		System.out.println("Enter Value of Any Number");
		int n = sc.nextInt();
		p.primeAccept(n);
		String s1=p.primeDisplay();
		System.out.println(" "+s1);
		
				
	}

}

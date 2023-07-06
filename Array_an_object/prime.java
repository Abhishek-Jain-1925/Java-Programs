package Array_an_object;

import java.util.Scanner;

class primeDemo
{
	int n,div;
	void accept(int n)
	{
		this.n=n;
	}
	
	String display()
	{
		for(int i=1;i<=(n/2);i++)
		{
			if(n%2==0)
			{
				div = 1;
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
public class prime
{

	public static void main(String[] args)
	{
		int n1,i,n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Record");
		n1=sc.nextInt();
		primeDemo p[]=new primeDemo[n1];
		for(i=0;i<n1;i++)
		{
			p[i]=new primeDemo();
			System.out.println("Enter Value Of n");
			n=sc.nextInt();
			p[i].accept(n);
			String s1=p[i].display();
			System.out.println(" "+s1);
		}
		
	}

}

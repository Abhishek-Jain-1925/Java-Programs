package Series;

import java.util.Scanner;

public class fibonacci
{
	int i,n,a=0,b=1,c;
	fibonacci(int n)
	{
		this.n=n;
	}
	void display()
	{
		for(i=1;i<=n;i++)
		{
			System.out.println(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}
	
}

package Series;

public class armstrong 
{
	int n,n1,sum=0,p;
	armstrong(int n)
	{
		this.n=n;
	}
	void display()
	{
		p=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=sum+(n1*n1*n1);
		}
		if(p==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}

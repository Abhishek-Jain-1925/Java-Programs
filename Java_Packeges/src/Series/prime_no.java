package Series;

public class prime_no
{
	int n,i,div=0;
	prime_no(int n)
	{
		this.n=n;
	}
	public void display()
	{
		for(i=2;i<(n/2);i++)
		{
			if(n%2==0)
			{
				div=1;
				break;
			}
		}
		if(div==0)
		{
			System.out.println(n+ " No. Is Prime");
		}
		else
		{
			System.out.println(n+ " No. Is Not Prime");
		}
	}
}

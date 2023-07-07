class MyNum
{
	int n;
	MyNum()
	{
		n=0;
	}
	MyNum(int n)
	{
		this.n=n;
	}
	void isPositive()
	{
		if(n>0)
		{
			System.out.println("\n\t "+n+" is Positive Number.");
		}
	}
	void isNegative()
	{
		if(n<0)
		{
			System.out.println("\n\t "+n+" is Negative Number.");
		}
	}
	void isZero()
	{
		if(n==0)
		{
			System.out.println("\n\t "+n+" is Negative Number.");
		}
		else
		{
			System.out.println("\n\t "+n+" is NOT Negative Number.");
		}
	}
	void isEven()
	{
		if(n%2==0)
		{
			System.out.println("\n\t "+n+" is Even Number.");
		}
	}
	void isOdd()
	{
		if(n%2!=0)
		{
			System.out.println("\n\t "+n+" is odd Number.");
		}
	}
}


class obj1
{
	public static void main(String[] asdb)
	{
		MyNum m = new MyNum(22);
		m.isPositive();
		m.isNegative();
		m.isEven();
		m.isOdd();
		m.isZero();
	}
}
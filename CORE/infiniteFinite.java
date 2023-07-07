class infiniteFinite
{
	public static void main(String args[])
	{
		int i,flag=0;
		for(i=1;;i++)
		{
			if(i<=10000)
			{
				System.out.print("\t "+i);				
			}
			if(i==10000){break;}
		}
	}
}
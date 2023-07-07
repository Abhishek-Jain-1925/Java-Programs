
class reverseNoCLA
{
	public static void main(String asdb[])
	{
		int rev=0,rem,n;
		n=Integer.parseInt(asdb[0]);
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.println("\n\t Reverse Number is : "+rev);
	}
}
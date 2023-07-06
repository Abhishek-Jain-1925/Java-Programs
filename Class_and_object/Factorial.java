package Class_and_object;

import java.util.Scanner;

class factDemo
{
	int n,i,f1=1;
	void factAccept(int n)
	{
		this.n=n;
	}
	int factDisplay()
	{
		for(i=n;i>1;i--)
		{
			 f1 = f1*i;
		}
		return f1;
	}
}
public class Factorial
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of n");
		factDemo f=new factDemo();
		n=sc.nextInt();
		f.factAccept(n);
		int s1=f.factDisplay();
		System.out.println(" "+s1);
	}

}

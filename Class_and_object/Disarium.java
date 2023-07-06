package Class_and_object;

import java.util.Scanner;

class disariumDemo
{
	int n,n1,num,p,f1,sum=0,digit = 0;
	void disaAccept(int n)
	{
		this.n=n;
	}
	String disaDisplay()
	{
		num=n;	
		p=n;
		while(num>0)
		{
			digit++;
			num=num/10;
		}
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			f1=1;
			for(int i = 1;i<=digit;i++)
			{
				f1=f1*n1;
			}
			digit--;
			sum=sum+f1;
		}
		if(sum==p)
			return("Number is Disarium ");
		else
			return("Number is not Disarium");		
	}
}
public class Disarium
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		disariumDemo d=new disariumDemo();
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		d.disaAccept(n);
		String s1=d.disaDisplay();
		System.out.println(" "+s1);
		
	}

}

package while_loop;

import java.util.Scanner;

public class Disarium_num_or_not {

	public static void main(String[] args) 
	{
		int n,n1,num,p,f1,sum=0,digit = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
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
			System.out.println("Number is Disarium ");
		else
			System.out.println("Number is not Disarium");
	}

}

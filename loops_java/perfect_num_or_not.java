package loops_java;

import java.util.Scanner;

public class perfect_num_or_not 
{
	public static void main(String[] args) 
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" is perfect no");
		}
		else
		{
			System.out.println(n+" is not perfect no");
		}
	}

}

package while_loop;

import java.util.Scanner;

public class magic_num_or_not {

	public static void main(String[] args) 
	{
		int n,n1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(n>9)
		{
			sum=0;
			while(n>0)
			{
				n1=n%10;
				n=n/10;
				sum=sum+n1;
			}
			n=sum;
		}			
		if(n==1)
			System.out.println("Number is magic");
		else
			System.out.println("Number not magic");
	}

}

package loops_java;

import java.util.Scanner;

public class display_factor
{

	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.println("fact=" +i);
			}
		}
	}

}

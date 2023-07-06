package loops_java;

import java.util.Scanner;

public class sum_between_x_and_y 
{

	public static void main(String[] args) 
	{
		int x=0,y=0,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of X");
		x=sc.nextInt();
		System.out.println("Enter Value Of Y");
		y=sc.nextInt();
		for(i=x;i<=y;i=i+(x+y))
		{
			sum=sum+i;
			System.out.println("Sum Btn X & Y= " +sum);
		}
	}

}

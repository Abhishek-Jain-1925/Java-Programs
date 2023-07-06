package while_loop;

import java.util.Scanner;

public class factorian_n {

	public static void main(String[] args)
	{
		int n,f1=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		i=n;
		while(i>1)
		{
			f1=f1*i;
			i--;
		}
		System.out.println("="+f1);
	}

}
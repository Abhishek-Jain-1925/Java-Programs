package loops_java;

import java.util.*;
public class factorial_n_num 
{

	public static void main(String[] args) 
	{
		int i,n,f1=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f1=f1*i;
			System.out.println(+f1);
		}
		
	}

}

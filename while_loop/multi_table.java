package while_loop;

import java.util.Scanner;

public class multi_table {

	public static void main(String[] args) 
	{
		int n,f1=1,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();
		while(i<=10)
		{
			f1=n*i;
			System.out.println(n+"*"+i+"="+f1);
			i++;
			
		}
		
	}

}

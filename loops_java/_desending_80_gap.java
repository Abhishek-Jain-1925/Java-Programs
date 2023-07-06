
package loops_java;

import java.util.Scanner;

public class _desending_80_gap {

	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value Of N");
		n=sc.nextInt();
		for(i=n;i>=1;i=i-80)
		{
			System.out.println(" " +i);
		}

	}

}

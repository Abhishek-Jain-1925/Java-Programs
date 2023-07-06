package while_loop;

import java.util.Scanner;

public class num_in_word 
{

	public static void main(String[] args) 
	{
		int n,n1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n");
		n=sc.nextInt();    // n=123
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		n=sum; //321
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			switch(n1)
			{
			case 0: System.out.print(" Zero");
			break;
			case 1: System.out.print(" One");
			break;
			case 2: System.out.print(" Two");
			break;
			case 3: System.out.print(" Three");
			break;
			case 4: System.out.print(" Four");
			break;
			case 5: System.out.print(" Five");
			break;
			case 6: System.out.print(" Six");
			break;
			case 7: System.out.print(" Seven");
			break;
			case 8: System.out.print(" Eight");
			break;
			case 9: System.out.print(" Nine");
			break;
			}
			
		}
		
	}

}

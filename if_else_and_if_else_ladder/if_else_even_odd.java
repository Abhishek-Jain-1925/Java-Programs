package if_else_and_if_else_ladder;

//Even/odd program
import java.util.*;
public class if_else_even_odd {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of num");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is Even");
		}
		else
		{
			System.out.println(num+" is odd");
		}
	}

}

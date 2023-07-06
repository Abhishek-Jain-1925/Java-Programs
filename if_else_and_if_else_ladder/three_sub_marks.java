package if_else_and_if_else_ladder;
//Accept 3 sub marks from users  and display its total,per & class

import java.util.Scanner;

public class three_sub_marks 
{

	public static void main(String[] args) 
	{
		double mar,math,sci,total,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mar,math,sci Marks");
		mar=sc.nextDouble();
		math=sc.nextDouble();
		sci=sc.nextDouble();
		total=mar+math+sci;
		per=(total/3);
		System.out.println("Total=" +total);
		System.out.println("per=" +per);
		if(per>=71 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>=35 && per<=70)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}

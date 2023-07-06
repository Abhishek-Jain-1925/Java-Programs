package games;

import java.util.Scanner;

public class In_Out_Class
{

	public static void main(String[] args)
	{
		int n,i;
		String Name,Game_Name;
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Players Play Indoor Games");
		n=sc.nextInt();
		
		Indoor I[]=new Indoor[n];
		for(i=0;i<n;i++)
		{
			System.out.println("----Indoor-----");
			System.out.println("Enter Player Name");
			Name = sc.next();
			System.out.println("Enter Game Name");
			Game_Name=sc.next();
			I[i]=new Indoor(Name, Game_Name);
		}
		for(i=0;i<n;i++)
		{
			I[i].display();
		}
		
		
		
		System.out.println("\nHow Many Players Play Outdoor Games");
		n=sc.nextInt();
		outdoor O[]=new outdoor[n];
		for(i=0;i<n;i++)
		{
			System.out.println("----Outdoor-----");
			System.out.println("Enter Player Name");
			Name = sc.next();
			System.out.println("Enter Game Name");
			Game_Name=sc.next();
			O[i]=new outdoor(Name, Game_Name);
		}
		for(i=0;i<n;i++)
		{
			O[i].display();
		}
	}

}
  

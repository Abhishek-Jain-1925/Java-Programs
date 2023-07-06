package Nested_if_else;

import java.util.Scanner;

public class Rahul_Program 
{
	public static void main(String args[])
	{
		float ram,sham,rahul;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ram Sham & Rahul Marks");
		ram=sc.nextFloat();
		sham=sc.nextFloat();
		rahul=sc.nextFloat();
		if(ram>sham)
		{
			System.out.println("Ram Marks More Than Sham");
		}
		else 
		{
			if(sham>rahul)
			{
				System.out.println("Sham Marks More Than Rahul");
			}
			else
			{
				System.out.println("Rahul Marks More Than Sham");
			}
		}
	}
}

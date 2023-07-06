package prgs;

import java.util.LinkedList;
import java.util.Scanner;

/*
 Create two singly LinkedList For String data (Do not allow duplicates in one list)
 1> Union             combine 2 list without allowed duplication
 2> Intersection		only same elements having both list
 3> Combining corresponding elements of the lists into a new lists are of the same size
 */



public class _1st_prg
{

	public static void main(String[] args)
	{
		LinkedList L1 = new LinkedList();
		LinkedList L2 = new LinkedList();
		LinkedList L3 = new LinkedList();
		LinkedList L4 = new LinkedList();
		LinkedList L5 = new LinkedList();
		
		String data;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Element to add List 1");
		n=sc.nextInt();
		System.out.println("Enter "+n+" Item In List 1");
		for(int i=0;i<n;i++)
		{
			
			data=sc.next();
			if(L1.contains(data))
			{
				System.out.println("Duplicates Not Allowed");
				i--;
			}
			else
			L1.add(data);
		}
		
		System.out.println("Enter The Size Of Element to add List 2");
		n=sc.nextInt();
		System.out.println("Enter "+n+" Item In List 2");
		for(int i=0;i<n;i++)
		{
			
			data=sc.next();
			if(L2.contains(data))
			{
				System.out.println("Duplicates Not Allowed");
				i--;
			}
			else
			L3.add(data);
		}
		System.out.println(" "+L1);
		System.out.println(" "+L2);
		
		
		
	}

}

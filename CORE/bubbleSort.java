import java.util.*;
class bubbleSort
{
public static void main(String[] asdb)
{
	Scanner s;
	s = new Scanner(System.in);
	int ch,temp;
	System.out.println("\n\t Enter How Many Numbers you want : ");
	ch = s.nextInt();
	int[] n = new int[ch];
	System.out.println("\n\t Enter "+ch+" Numbers One By One : ");
	for(int i=0;i<ch;i++)
	{
		n[i] = s.nextInt();
	}
	System.out.println("Your Entered Numbers Are :");
	for(int i=0; i<ch; i++)
	{
		System.out.println("\n\t"+n[i]);
	}
	//Bubble Sort Begins
	for(int i=0;i<ch;i++)
	{
		for(int j=0; j<(ch-i-1);j++)
		{
			if(n[j]>n[j+1])
			{
				temp = n[j];
				n[j] = n[j+1];
				n[j+1] = temp;
			}
		}
	}
	
	System.out.println("Sorted Array Is :");
	for(int i=0;i<ch;i++)
	{
		System.out.println("\n\t"+n[i]);
	}
}	
}
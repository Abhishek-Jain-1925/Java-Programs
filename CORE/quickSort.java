import java.util.*;
class quickSort
{
public static void main(String[] asdb)
{
	Scanner s;
	s = new Scanner(System.in);
	int ch;
	System.out.println("\n\t Enter How Many Numbers you want : ");
	ch = s.nextInt();
	int[] n = new int[ch];
	System.out.println("\n\t Enter "+ch+"Numbers One By One : ");
	for(int i=0;i<ch;i++)
	{
		n[i] = s.nextInt();
	}
	System.out.println("Your Entered Numbers Are :");
	for(int i=0; i<ch; i++)
	{
		System.out.println("\n\t"+n[i]);
	}
	QuickSort(n,0,ch-1);
}	
public void QuickSort(int n[ch],int first,int last)
{
	int i,j,pivot,temp;
	if(first<last)
	{
		pivot = first;
		i=first;
		j=last;
		while(i<j)
		{
			while(n[i]<=n[pivot] && i<last)
				i++;
			while(n[j]>n[pivot])
				j--;
			if(i<j)
			{
				temp = n[pivot];
				n[pivot] = n[j];
				n[j] = temp;
				QuickSort(n,first,j-1);
				QuickSort(n,j+1,last);
			}
		}
	}
}
}
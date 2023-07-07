import java.util.*;
class arrayIO
{
public static void main(String[] asdb)
{
	Scanner s;
	s = new Scanner(System.in);
	int ch;
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
}	
}
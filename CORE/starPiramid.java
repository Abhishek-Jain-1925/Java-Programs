import java.util.*;

class starPiramid
{
	public static void main(String asdb[])
	{
		Scanner s = new Scanner(System.in);
		int n,i,j;
		System.out.println("\n\t Enter How many Rows You Want : ");
		n = s.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}
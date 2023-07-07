import java.util.*;

class set1
{
	public static void main(String[] asdb)
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		System.out.println("\n\t Enter How Many Numbers You Want : ");
		n = s.nextInt();
		String[] arr = new String[n];
		System.out.println("\n\t Enter "+n+" Items One by One : ");
		for(i=0;i<n;i++)
		{
			arr[i]=s.next();
			set.add((arr[i]));
		}
		System.out.println("\n\t Your Entered Set Is : \n\t");
		System.out.println(set);
	}
}
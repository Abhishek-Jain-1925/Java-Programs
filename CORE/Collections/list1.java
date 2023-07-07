import java.util.*;

class list1
{
	public static void main(String[] asdb)
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		List<String> l = new ArrayList<>();
		System.out.println("\n\t Enter How Many Numbers You Want : ");
		n = s.nextInt();
		String[] arr = new String[n];
		System.out.println("\n\t Enter "+n+" Items One by One : ");
		for(i=0;i<n;i++)
		{
			arr[i]=s.next();
			l.add((arr[i]));
		}
		System.out.println("\n\t Your Entered List Is : \n\t");
		System.out.println(l);
	}
}
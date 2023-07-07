import java.util.*;

class map1
{
	public static void main(String[] asdb)
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		Map<Integer,String> map = new HashMap<Integer,String>();
		System.out.println("\n\t Enter How Many Numbers You Want : ");
		n = s.nextInt();
		String[] arr = new String[(n+1)];
		System.out.println("\n\t Enter "+n+" Items One by One : ");
		for(i=1;i<=n;i++)
		{
			arr[i]=s.next();
			map.put(i,arr[i]);
		}
		System.out.println("\n\t Your Entered Set Is : \n\t");
		System.out.println(map);
	}
}
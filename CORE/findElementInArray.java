import java.util.Scanner;
class findElementInArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,n,elem,flag=0,pos=0; 		
		System.out.println("\n\t Enter How many Numbers You Want :");
		n = sc.nextInt();
		int[] arr1 = new int[n];
		//int[] arr1 = {5,10,15,20,25};
		System.out.println("\n\t Enter "+n+" Elements one by one : ");
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		do{
		System.out.print("\n\t Enter Element To Search : ");
		elem = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr1[i]==elem)
			{
				flag=1; pos=(i+1);
			}
		}
		if(flag==1){System.out.println("\n\t******* Element Found..!!! at Position: "+pos);}
		else{System.out.println("\n\t Element Not Found!!!");}
		}while(flag!=1);
	}
}
import java.util.Scanner;
class task1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,k=0,j,pos=0,dir=0;
		
		System.out.println("\n\t Enter How many elemnts You want : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] b = new int[n];
		
		System.out.println("\n\t Enter "+n+" elemnts One by One : ");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\n\t Your Entered Array is : ");
		for(i=0;i<n;i++)
		{
		System.out.print("\t "+arr[i]);
		}
		
		System.out.println("\n\t Enter Number to shift from that Position Onwards : ");
		pos = sc.nextInt();
		System.out.println("\n\t Enter Direction to Shift(1:right ,0:Left) : ");
		dir = sc.nextInt();	
		
		
		if(dir==0){
			System.out.println("\n\t Array After Shifting from"+pos+" is : ");
			k=0;
		for(i=0;i<n;i++)
		{
			if((i+pos)<n){
			b[i+pos]=arr[i];
			}
			else
			{
				b[k]=arr[i];
				k++;
			}
		}
		for(i=0;i<n;i++)
		{
		System.out.print("\t "+b[i]);
		}
		}
		else if(dir==1){			
				k=0;
				System.out.println("\n\t Array After Shifting from "+pos+" is : ");
		for(i=0;i<n;i++)
		{
			if((i+pos)<n){
			b[i]=arr[i+pos];
			}
			else{
				b[i]=arr[k];
				k++;	
			}
		}
			for(i=0;i<n;i++)
		{
		System.out.print("\t "+b[i]);
		}
		}
		else{
			System.out.println("\n\t ***** INVALID Selection **** ");
		}
		
	}
}
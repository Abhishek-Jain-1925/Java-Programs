package Interfaces;



import java.util.Scanner;

interface product
{
	abstract void display();
}

class product1 implements product
{
	int p_id;
	String p_name;
	double p_cost;
	int p_quantity;
	static int count = 0;
	product1(int p_id,String p_name,double p_cost,int p_quantity)
	{
		this.p_id=p_id;
		this.p_name=p_name;
		this.p_cost=p_cost;
		this.p_quantity=p_quantity;
		count++;
	}
	@Override
	public void display()
	{
		System.out.println("Product Id= "+p_id);
		System.out.println("Product Name= "+p_name);
		System.out.println("Product Cost= "+p_cost);
		System.out.println("Product Quantity= "+p_quantity);
		
	}
	
}
public class Interface4
{

	public static void main(String[] args, String count) 
	{
		int i,n;
		int p_id;
		String p_name;
		double p_cost;
		int p_quantity;
		Scanner sc=new Scanner(System.in);
System.out.println("\n----------Default Constructor------------");
		product1 p=new product1(101,"HandWash",60,100);
		product1 p1=new product1(102,"LifeBoy Soaf",30,50);
		product1 p2=new product1(103,"Colgate",200,40);
		product1 p3=new product1(104,"ToothBrush",40,10);
		p.display();
		p1.display();
		p2.display();
		p3.display();
System.out.println("\n\n----------Parameterized Constructor------------");
		System.out.println("Enter the no of record");
		n=sc.nextInt();
		product1 p4[]=new product1[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter P_id");
			p_id=sc.nextInt();
			System.out.println("Enter P_Name");
			p_name=sc.next();
			System.out.println("Enter P_cost");
			p_cost=sc.nextInt();
			System.out.println("Enter P_quantity");
			p_quantity=sc.nextInt();	
			p4[i]=new product1(p_id, p_name, p_cost, p_quantity);
		}
		for(i=0;i<n;i++)
		{
			p4[i].display();
		}
		System.out.println("Total No Of Object Are Created In Our Program is= "+product1.count++);
	}

}
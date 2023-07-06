package Abstract;

import java.util.Scanner;

abstract class order
{
	int id;
	String Product_Name;
	order(int id,String Product_Name)
	{
		this.id=id;
		this.Product_Name=Product_Name;
	}
	
	abstract void methodshow();
	
}

class Purchase_Order extends order
{
	String cus_name;
	Purchase_Order(int id, String Product_Name, String cus_name)
	{
		super(id, Product_Name);
		this.cus_name=cus_name;
	}
	
	void methodshow()
	{
		System.out.println("ID= "+id);
		System.out.println("Product Name= "+Product_Name);
		System.out.println("Customer Name= "+cus_name);
	}
	
}

class Sales_Order extends order
{
	String vendor_name;
	Sales_Order(int id, String Product_Name,String vendor_name)
	{
		super(id, Product_Name);
		this.vendor_name=vendor_name;
	}
	
	void methodshow()
	{
		System.out.println("ID= "+id);
		System.out.println("Product Name= "+Product_Name);
		System.out.println("Vendor Name= "+vendor_name);
	}
	
}
public class order1
{

	public static void main(String[] args)
	{
		int id,ch;
		String Product_Name;
		String cus_name;
		String vendor_name;
		do
		{
			System.out.println("1.Accept Details Purchase_Order ");
			System.out.println("1.Accept Details Sales_Order ");
			System.out.println("Enter Your Choice");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter Id, Product Name,Customer Name");
					id=sc.nextInt();
					Product_Name=sc.next();
					cus_name=sc.next();
					Purchase_Order p=new Purchase_Order(id, Product_Name, cus_name);
					p.methodshow();
					break;
					
					
				case 2:
					System.out.println("Enter Id, Product Vendor Name");
					id=sc.nextInt();
					Product_Name=sc.next();
					cus_name=sc.next();
					Sales_Order s=new Sales_Order(id, Product_Name, cus_name);
					s.methodshow();
					break;
					
					
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}while(ch<=3);
	}
}

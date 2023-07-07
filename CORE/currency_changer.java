import java.util.*;

class currency_changer
{
	public static void main(String asdb[])
	{
		double rs;
		int ch;
		Scanner s;
		s = new Scanner(System.in);
		System.out.println("Enter the Amount You Want Check in Another Currency : ");
		rs = s.nextDouble();
		do{
		System.out.println("\n -------------------");
		System.out.println("\n My Menu...!");
		System.out.println("\n -------------------");
		System.out.println("\n 1.Indian Rupees");
		System.out.println("\n 2.Dollar");
		System.out.println("\n 3.Euro");
		System.out.println("\n 4.Pound");
		System.out.println("\n 5.Japanese Yen");
		System.out.println("\n 6.Exit");
		System.out.println("\n Enter Your Choice : ");
		ch = s.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println(rs);
					break;
			case 2:
					double dol = rs*0.013;
					System.out.println("\n\t $ "+dol+" /-");
					break;
			case 3:
					double Euro = rs*0.012;
					System.out.println("\n\t"+Euro+" /-");
					break;
			case 4:
					double Pound = rs*0.0098;
					System.out.println("\n\t "+Pound+" /-");
					break;
			case 5:
					double yen = rs*1.52;
					System.out.println("\n\t Rupees = "+yen+" /-");
					break;
			case 6:
					System.exit(0);
					break;
			default :
					System.out.println("Please Enter Valid Choice And Try Again...!");
		}
	}while(ch != 6);
	}
}
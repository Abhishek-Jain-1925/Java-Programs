import java.util.Scanner;
import javax.swing.*;

class atm
{
	public static void main(String[] asdb)
	{
		Scanner s = new Scanner(System.in);
		float bal=0;
		float amt=0;
		int ch;
		do{
		System.out.println("\n\t----------------------");
		System.out.println("\n\t WEL-COME to National Bank ATM ");
		System.out.println("\n\t----------------------");
		System.out.println("\n\t 1.Deposit");
		System.out.println("\n\t 2.Withdrawl");
		System.out.println("\n\t 3.View Balance");
		System.out.println("\n\t 4.Exit");
		System.out.println("\n\t Enter Your Choice : ");
		ch = s.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("\n\t Enter Amount To Be Deposit : ");
				amt = s.nextFloat();
				bal += amt;
				//bal = bal + amt;
				JOptionPane.showMessageDialog(null,"Amount "+amt+"/-  Deposited SuccessFully...!");
				System.out.println("\n\t New Balance : "+bal);
				break;
			}
			case 2:
			{
				System.out.println("\n\t Enter Amount to Withdrawl : ");
				amt = s.nextFloat();
				if(amt > bal)
				{
					JOptionPane.showMessageDialog(null,"Insufficient Balance...!","National Bank Pvt.Ltd.",JOptionPane.ERROR_MESSAGE);
					System.out.println("\n\t ********** Withdrawl Transaction Failed..!! ");
				}
				else
				{
					bal -= amt;
					JOptionPane.showMessageDialog(null,"Amount "+amt+"/-  Withdrawl SuccessFully...!");
					System.out.println("\n\t Rem. Balance : "+bal+" /- ");
				}
				break;
			}
			case 3:
			{
				System.out.println("\n\t********************");
				System.out.println("\n\t Account Closing Balance : "+bal+" /-");
				System.out.println("\n\t*********************");
				break;
			}
			case 4:
			{
				System.out.println("\n\t Thank You for Banking with Us...!");
				System.exit(0);
				break;
			}
		}
		}while(ch!=4);
	}
}
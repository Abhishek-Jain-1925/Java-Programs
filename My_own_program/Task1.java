package My_own_program;

import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args) 
	{
		int cpin,cammount=20000,count=1,cnt=0,withdr_amnt,deposite_amnt,ch = 0,remain_bal = 0,Total_bal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Pin");
		cpin=sc.nextInt();
	    while(count<3 && cpin!=4264)
	    {
	    			System.out.println("Wrong Pin..!Attempt Left");
		    		cpin=sc.nextInt();
		    		count++;
		    		if(count==3)
		    			System.out.println("Your ATM Has Been Locked..Try After 24hr.");
		    		
	    }
	    if(cpin==4264)
		{
	    	System.out.println("YOUR ACCOUNT TYPE");
		    System.out.println("1. Current Account");
		    System.out.println("2. Saving Account");
		    ch=sc.nextInt();
		    switch(ch)
		    {
		    	case 1:
		    		System.out.println("Account Balance\n"+cammount);
		    		System.out.println("Enter Your Choice"); 
		    		System.out.println("1. Withdraw Ammount");
		    		System.out.println("2. Deposite Ammount");
		    		ch=sc.nextInt();
		    		switch(ch)
		    		{	    			  	
		    			 case 1: 
		    				System.out.println("Enter Withdraw Ammount");
		    			  	withdr_amnt=sc.nextInt();
		    			  	if(withdr_amnt<=cammount)
		    			  	{
		    			  		System.out.println("Take Your Cash="+withdr_amnt);
		    			  		remain_bal=cammount-withdr_amnt;
		    			  		System.out.println("Remain Balance="+remain_bal);
		    			  	}
		    			  	else
		    			  	{
		    			  		System.out.println("Insufficient Balance.");
		    			  		
		    			  	}
		    			  	break;
		    			  	
		    			  	case 2: 
		    			  		System.out.println("Enter Deposite Ammount");
		    			  		deposite_amnt=sc.nextInt();
		    			  		if(deposite_amnt>=500)
		    			  		{
		    			  			cammount=cammount+deposite_amnt;
		    			  			System.out.println("Total Balance="+cammount);
		    			  		}
		    			  		else
		    			  		{
		    			  			System.out.println("Pls Enter Correct Amount");
		    			  		}
		    			  		break;
		    			  		default:
		    			  				System.out.println("Invalid Choice");
		    			  				break;
		    		}
		    		System.exit(0);
		    		case 2:
		    			  System.out.println("Your Account Balance\n"+cammount);
		    			  System.out.println("Enter Your Choice");
		    			  
		    			  System.out.println("1. Withdraw Ammount");
		    			  System.out.println("2. Deposite Ammount");
		    			  ch=sc.nextInt();
		    			  switch(ch)
		    			  {	    			  	
		    			  	case 1: System.out.println("Enter Withdraw Ammount");
		    			  			withdr_amnt=sc.nextInt();
		    			  			if(withdr_amnt<=cammount)
		    			  			{
		    			  				System.out.println("Take Your Cash="+withdr_amnt);
		    			  				remain_bal=cammount-withdr_amnt;
		    			  				System.out.println("Remain Balance="+remain_bal);
		    			  			}
		    			  			else
		    			  			{
		    			  				System.out.println("Insuffient Balance");
		    			  			}
		    			  			break;
		    			  	
		    			  	case 2: System.out.println("Enter Deposite Ammount");
		    			  			deposite_amnt=sc.nextInt();
		    			  			if(deposite_amnt>=500)
		    			  			{
		    			  				cammount=cammount+deposite_amnt;
		    			  				System.out.println("Total Balance="+cammount);
		    			  			}
		    			  			else
		    			  			{
		    			  				System.out.println("pls Enter Correct Amount");
		    			  			}
		    			  	
		    			  			break;
		    			  			default:
		    			  				System.out.println("Invalid Choice");
		    			  				break;
		    			  }
		    			  System.exit(0);
		    			  break;
		    			  default:
		    			  System.out.println("Invalid Choice");  
		    			  break;
		    		}
		    }
	}
}
	    



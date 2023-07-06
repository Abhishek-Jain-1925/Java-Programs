package switch_case;

import java.util.*;
public class week_show 
{
	public static void main(String args[])
	{
		int day;
		String dayString = null,daytype = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Choice");
		day=sc.nextInt();
		
			switch(day)
			{
				case 1:
					dayString="Monday"; daytype="Weekday";
					break;
				case 2:
					dayString="Tuesday"; daytype="Weekday";
					break;
				case 3:
					dayString="Wednesday"; daytype="Weekday";
					break;
				case 4:
					dayString="Thursday"; daytype="Weekday";
					break;
				case 5:
					dayString="Friday"; daytype="Weekday";
					break;
				case 6:
					dayString="Saturday"; daytype="Weekend";
					break;
				case 7:
					dayString="sunday"; daytype="Weekend";
					break;
				case 8:
					System.out.println(0);
					break;
					default:dayString="Invalid choice";
					
			}
		System.out.println(dayString + " is a " + daytype);
		
	}
}

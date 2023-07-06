package Exception_Programs;

import java.util.Scanner;

class InvalidDayException extends Exception {
	public String toString() {
		return "Day is not valid";
	}
}

class InvalidMonthException extends Exception
{

	@Override
	public String toString() {
		return "Month Is Invalid";
	}
	
}
class YearException extends Exception {
	public String toString() {
		return "Year is invalid";
	}
}

public class UserDefine5
{
	public static void main(String[] args) 
	{
		int m,d,y;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day month year");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		try
		{
			if(y>=1000 &&y<=9999)
			{
				if(m>=1&&m<=12)
				{
					if(d>=1 &&d<=31)
					{
						switch(m)
						{
							case 1:case 3:case 5:case 7:case 8:case 10:case 12:	
								System.out.println(d+"-"+m+"-"+y+ "   Valid date");
								break;
							case 4:case 6:case 9:case 11:
								if(d<=30)						
									System.out.println(d+"-"+m+"-"+y+ "   Valid date");						
								else
									System.out.println(d+"-"+m+"-"+y+ "   inValid date");
								break;
						
							case 2:
								if(y%4==0 && d<=29)
									System.out.println(d+"-"+m+"-"+y+ "   Valid date");
								else if(d<=28)
									System.out.println(d+"-"+m+"-"+y+ "   Valid date");
								else
									System.out.println(d+"-"+m+"-"+y+ "   inValid date");
								break;
							default:break;												
						}
					}
					else
					{
						throw new InvalidDayException();
					}								
				}
				else
				{
					throw new InvalidMonthException();
				}			
			}
			else
			{
				throw new YearException();
			}		
		}
		catch(InvalidDayException e)
		{
			System.out.println(e);;
		}
		catch(InvalidMonthException e1)
		{
			System.out.println(e1);
		}
		catch(YearException e2)
		{
			System.out.println(e2);
		}
		
	}
}

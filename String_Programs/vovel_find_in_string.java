package String_Programs;

import java.util.Scanner;

public class vovel_find_in_string 
{

	public static void main(String[] args) 
	{
		String s1;
		int cnt = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String");
		s1=sc.next();
		
		StringBuffer sb1=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				cnt++;
		}
		
		System.out.println("Total No. Of Vovels= "+cnt);
	}

}

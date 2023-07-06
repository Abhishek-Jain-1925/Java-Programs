package Nested_if_else;
import java.util.*;
public class date_validate_if_else {
public static void main(String[] args) 
{
int d,m,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Date");
d=sc.nextInt();
System.out.println("Enter Your Month");
m=sc.nextInt();
System.out.println("Enter Your Year");
y=sc.nextInt();
if(y>=1000 && y<=9999)
{
if(m>=1 && m<=12)
{
if(d>=1 && d<=31)
{
if(m==1 && m==3 && m==5 && m==7 && m==8 && 
m==10 && m==12)
{
System.out.println(d+ "/" +m+ "/" +y);
System.out.println("Valid Date");
}
else if(m==4 && m==6 && m==9 && m==11)
{
if(d<=30)
{
System.out.println(d+ "/" +m+ "/"
+y);
System.out.println("Valid Date");
}
else
{
System.out.println(d+ "/" +m+ "/"
+y);
System.out.println("InValid Date");
}
}
else
{
if(y%4==0 && d<=29)
{
System.out.println(d+ "/" +m+ "/"
+y);
System.out.println("Valid Date");
}
else if(d<=28)
{
System.out.println(d+ "/" +m+ "/"
+y);
System.out.println("Valid Date");
}
else
{
System.out.println("InValid Date");
}
}
}
else
{
System.out.println("Enter Valid Date");
}
}
else
{
System.out.println("Enter Valid Month");
}
}
else
{
System.out.println("Enter Valid year");
}
}
}

package maths;

public class Maximum
{
	private  int a,b,c;
	   public Maximum(int a,int b)
	   {
		   this.a=a;
		   this.b=b;
	   }
	   public void calMax()
	   {
		   c=(a>b)?a:b;
		   System.out.println("Max="+c);
	   }
}



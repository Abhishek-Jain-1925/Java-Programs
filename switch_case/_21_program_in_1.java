package switch_case;

import java.util.Scanner;

public class _21_program_in_1 {

	public static void main(String[] args) 
	{
		int ch;
		double num;
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			System.out.println("1.Even or Odd\n2.Divisible By 7\n3.Divisible by 5 && 7\n4.divisible by 5 or 7\n5.leap year or not\6.Positive or Negative"
					+ "\n7.Calculate electricity bill\n8.Age Eligible For Vote or Not \n9.Discount\n10.pin\n11.first no is between Secod no and third no\n12.min from 3 numbers"
					+ "\n13.max from 3 numbers\n14.Pass/Fail/ATKT\n15.Triangle or not\n16.Blood Donation Eligible or Not\n17.Apptitude Eligiblity"
					+ "\n18.Max 2 Numbers\n19.Loss or Profit\n20.Quadrant\n21.Exit ");
			System.out.println("_______________________________________________________");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter The Number ");
					num=sc.nextDouble();
					if(num%2==0)
					{
						System.out.println("Even Number");
					}
					else 
					{
						System.out.println("Odd Number");
					}
					break;
				case 2:
					System.out.println("Enter The Number");
					num=sc.nextDouble();
					if(num%7==0)
					{
						System.out.println("Enter Number Divisible By 7");
					}
					else
					{
						System.out.println("Enter Number Is Not Divisible By 7");
					}
					break;
				case 3:
					System.out.println("Enter The Number");
					num=sc.nextDouble();
					if((num%5==0) && (num%7==0))
					{
						System.out.println("Number Is Divisible By 5 and(&&) 7");
					}
					else
					{
						System.out.println("Number Is Not Divible 5 and 7");
					}
					break;
				case 4:
					System.out.println("Enter The Number");
					num=sc.nextDouble();
					if((num%5==0) || (num%7==0))
					{
						System.out.println("Number Is Divisible By 5 or (||) 7");
					}
					else
					{
						System.out.println("Number Is Not Divible 5 or 7");
					}
					break;
				case 5:
					System.out.println("Enter The Number");
					num=sc.nextDouble();
					if(num%4==0)
					{
						System.out.println(+num +"is a leap year");
					}
					else
					{
						System.out.println(+num +"is not leap year");
					}
					break;
				case 6:
					System.out.println("Enter The Number");
					num=sc.nextDouble();
					if(num>0)
					{
						System.out.println(num+ " is positive");
					}
					else if(num<0)
					{
						System.out.println(num+ " is Negative");
					}
					else
					{
						System.out.println("Entered number."
								+ ""
								+ " is Zero");
					}
					break;
				case 7:
					double bill_amt,unit;
					System.out.println("Enter The Unit");
					unit=sc.nextDouble();
					if((unit>=100) && (unit<=300))
					{
						bill_amt=unit*5;
						System.out.println("Bill Amount=" +bill_amt);
					}
					else if((unit>=301)&&(unit<=500))
					{
						bill_amt=unit*8;
						System.out.println("Bill Amount=" +bill_amt);
					}
					else if((unit>=501)&&(unit<=800))
					{
						bill_amt=unit*10;
						System.out.println("Bill Amount=" +bill_amt);
					}
					else
					{
						bill_amt=unit*12;
						System.out.println("Bill Amount=" +bill_amt);
					}
					break;
				case 8:
					System.out.println("Enter age");
					double age=sc.nextDouble();
					if((age>=18)&&(age<=120))
					{
						System.out.println("Your Eligible For Vote");
					}
					else
					{
						System.out.println("Your Not Eligible For Vote");
					}
					break;
				case 9:
					double discount,amt,total,disc_per,disc_total;
					System.out.println("Enter Amount");
					amt=sc.nextDouble();
					System.out.println("Enter Discount In %");
					disc_per=sc.nextDouble();
					disc_total=disc_per/100;
					if(amt<10000)
					{
						System.out.println("No Discount");
					}
					else if(amt>=10000 && amt<20000)
					{
						discount=amt*disc_total;
						total=amt-discount;
						System.out.println("Discount=" +discount +" Total="+total);
					}
					else if(amt>=20000 && amt<40000)
					{
						discount=amt*disc_total;
						total=amt-discount;
						System.out.println("Discount=" +discount +" Total="+total);
					}
					else if(amt>=40000 && amt<=50000)
					{
						discount=amt*disc_total;
						total=amt-discount;
						System.out.println("Discount=" +discount +" Total="+total);
					}
					else
					{
						discount=amt*disc_total;
						total=amt-discount;
						System.out.println("Discount=" +discount +" Total="+total);
					}
					break;
				case 10:
					System.out.println("Enter Your Pin");
					int pin=sc.nextInt();
					if(pin==2225)
					{
						System.out.println("Correct Pin");
					}
					else
					{
						System.out.println("Incorrect Pin");
					}
					break;
				case 11:
					int a,b,c;
					System.out.println("Enter 3 Numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					if((a>b && a<c) || (a<b && a>c))
					{
						System.out.println(a+ "Is Between" +b+ "and" +c);
					}
					else
					{
						System.out.println(a+ "Is Between" +b+ "and" +c);
					}
					break;
				case 12:
					System.out.println("Enter 3 numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					
					if(a<b)
					{
						if(a<c)
						{
							System.out.println("Min=" +c);
						}
						else
						{
							System.out.println("Min=" +c);
						}
					}
					else if(b<a)
					{
						if(b<c)
						{
							System.out.println("Min=" +a);
						}
						else
						{
							System.out.println("Min=" +c);
						}
					}
					else
					{
						System.out.println("Both Are Equals");
					}
					break;
				case 13:
					System.out.println("Enter 3 numbers");
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					
					if(a>b)
					{
						if(a>c)
						{
							System.out.println("Max=" +c);
						}
						else
						{
							System.out.println("Max=" +c);
						}
					}
					else if(b>a)
					{
						if(b>c)
						{
							System.out.println("Max=" +a);
						}
						else
						{
							System.out.println("Max=" +c);
						}
					}
					else
					{
						System.out.println("Both Are Equals");
					}
					break;
				case 14:
						double math,mar,eng,sci,total_m,per;
						System.out.println("Enter Your Marks ");
						math=sc.nextInt();
						mar=sc.nextInt();
						eng=sc.nextInt();
						sci=sc.nextInt();
						total_m=math+mar+eng+sci;
						per=total_m/5;
						System.out.println("Total="+total_m +" Per" +per);
						if(per>=70 && per<=100)
						{
							System.out.println("Distiction");
						}
						else if(per>=50 && per<70)
						{
							System.out.println("Higher");
						}
						else if(per>=35 && per<50)
						{
							System.out.println("Pass");
						}
						else
						{
							System.out.println("Fail");
						}
					break;
				case 15:
					System.out.println("Enter Value of a , b ,c");
					a=sc.nextInt();
					b=sc.nextInt();
					c=sc.nextInt();
					if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b))
					{
						System.out.println("Right Angle Triangle");
					}
					else if((a==b) && (b==c))
					{
						System.out.println("Equilateral triangle");
					}
					else if((a==b) || (b==c) || (c==a))
					{
						System.out.println("Isosceles triangle");
					}
					else if((a!=b&& b!=c && c!=a))
					{
						System.out.println("Scalene");
					}
					else
					{
						System.out.println("Not Triangle");
					}
					break;
				case 16:
					int wait,hb,age_;
					System.out.println("Enter Your Age, Wait, HB");
					age_=sc.nextInt();
					wait=sc.nextInt();
					hb=sc.nextInt();
					if(age_>=18)
					{
						if(wait>=55)
						{
							if(hb>=12)
							{
								System.out.println("Your Eligible For Blood Donation");
							}
							else
							{
								System.out.println("Your HB is not more than 12");
							}
						}
						else
						{
							System.out.println("Your Wait not More Than 55");
						}
					}
					else
					{
						System.out.println("Your Age not more than 18");
					}
					break;
				case 17:
					double tenth_per,twel_per,lasty_per;
					System.out.println("Enter Your Percentage");
					tenth_per=sc.nextDouble();
					twel_per=sc.nextDouble();
					lasty_per=sc.nextDouble();
					if(tenth_per>=60)
					{
						if(twel_per>=60)
						{
							if(lasty_per>=60)
							{
								System.out.println("Your Eligible For Apptitude Test");
							}
							else
							{
								System.out.println("Your Last Year Per. Less Than 60%");
							}
						}
						else
						{
							System.out.println("Your 12th Per. Less Than 60%");
						}
					}
					else 
					{
						System.out.println("Your 10th Per. Less Than 60%");
					}
					break;
				case 18:
						System.out.println("Enter Value of a & b");
						a=sc.nextInt();
						b=sc.nextInt();
						if(a>b)
						{
							System.out.println("Max=" +a);
						}
						else if(b>a)
						{
							System.out.println("Max=" +b);
						}
						else
						{
							System.out.println("Equals");
						}
						break;
				case 19:
					int sp,cp,amts= 0,display;
					System.out.println("Enter Cost Price");
					cp=sc.nextInt();
					System.out.println("Enter Selling Price");
					sp=sc.nextInt();
					if(sp>cp)
					{
						amts=sp-cp;
						display=(amts/cp)*100;
						System.out.println("profit=" +amts+ "percentage=" +display);
					}
					else if(cp>sp)
					{
						amt=cp-sp;
						display=(amts/cp)*100;
						System.out.println("loss=" +amts+ "percentage=" +display);
					}
					else
					{
						System.out.println("No Profit No loss");
					}
					break;
				case 20:
					int x,y;
					System.out.println("Enter Value Of X and Y");
					x=sc.nextInt();
					y=sc.nextInt();
					if(x>0&&y>0)
					{
						System.out.println(x+" and "+y+" are Quadrant 1");
					}
					else if(x<0&&y>0)
					{
						System.out.println(x+" and "+y+" are Quadrant 2");
					}
					else if(x<0&&y<0)
					{
						System.out.println(x+" and "+y+" are Quadrant 3");
					}
					else if(x>0&&y<0)
					{
						System.out.println(x+" and "+y+" are Quadrant 4");
					}
					else if(x>0&&y==0)
					{
						System.out.println(x+" is on +x axis");
					}
					else if(x<0&&y==0)
					{
						System.out.println(x+" is on -x axis");
					}
					else if(x==0&&y>0)
					{
						System.out.println(x+" is on +y axis");
					}
					else if(x==0&&y<0)
					{
						System.out.println(x+" is on -y axis");
					}

					else 
					{
						System.out.println(x+" and "+y+" are on origin");
					}
					break;
				case 21:
					System.out.println(0);
					break;
					default: 
						System.out.println("Invalid Case");		
			}
			
		}while(ch<=21);
		
	}

}

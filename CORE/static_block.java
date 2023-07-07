/*

there are 3 types of blocks are there in JAVA namely as follows-
	1.Static Block 				(i.e. as shown in below example)
	2.try block 				(i.e. try catch exception handling block)
	3.Synchronization block 	(i.e. which is used in thread concept)

*/

class static_block
{
	public static void main(String args[])
	{
		System.out.println("\n\t Inside the Main Method()");
	}
	
	static
	{			
		System.out.println("\n\t Inside the Static Block");
	}
	
}
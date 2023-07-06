package games;

public class outdoor
{
	
	String Name,Game_Name;
	outdoor(String Name,String Game_Name)
	{
		this.Name=Name;
		this.Game_Name=Game_Name;
	}
	
	void display()
	{
		System.out.println("Players Name :-_" +Name);
		System.out.println("Game Name :- " +Game_Name);
	}
	
}

package games;

public class Indoor 
{
	String Name,Game_Name;
	Indoor(String Name,String Game_Name)
	{
		this.Name=Name;
		this.Game_Name=Game_Name;
	}
	
	void display()
	{
		System.out.println("Players Name :- " +Name);
		System.out.println("Game Name :- " +Game_Name);
	}
	
}

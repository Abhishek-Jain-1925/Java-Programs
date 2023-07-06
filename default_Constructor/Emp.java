package default_Constructor;

class Employee
{
	int eid;
	String name;
	double salary;
	Employee()
	{
		eid=4264;
		name="Aavej";
		salary=60000;
	}
	void display()
	{
		System.out.println("Eid="+eid);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
	}
}

public class Emp
{

	public static void main(String[] args)
	{
		Employee E=new Employee();
		E.display();
	}

}

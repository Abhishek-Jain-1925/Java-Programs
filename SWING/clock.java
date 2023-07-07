import javax.swing.*;
import java.util.*;
import java.text.*;

class clockMe extends JFrame
{
	JLabel l1;
	Thread t = null;
	SimpleDateFormat formatter;
	Date date;
	clockMe()
	{
		super(" CLOCK ");
		setLocation(1160,0);
		//t = new Thread(this);
		t.start();
		formatter = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		date = new Date();
		l1 = new JLabel();
		add(l1);
		String Time = formatter.format(date);
		l1.setText(Time);
		sleep(1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,100);
		setVisible(true);
	}
	/*public void run(){
		t.sleep(1000);
		}*/
}

class clock
{
	public static void main(String[] asdb)
	{
		new clockMe();
	}
}
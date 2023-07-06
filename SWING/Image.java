package SWING;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JImg extends JFrame
{
	ImageIcon img;
	JLabel l;
	JImg()
	{
		setVisible(true);
		setSize(1024,786);
		setTitle("Add Img On Frame");
		setResizable(false); 		// For This Control We Can Not Use Maximize Button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		img = new ImageIcon("");
		l = new JLabel(img);
		
		add(l);
	}
}
public class Image {

	public static void main(String[] args) {
		new JImg();

	}

}

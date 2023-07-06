package AWT;

import java.awt.*;
import java.awt.event.*;

class myFrame1 extends Frame implements WindowListener
{
	myFrame1()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400,200);
		setTitle("My First Frame");
		addWindowListener(this);
		
	}

	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class _1st_prg_copy 
{

	public static void main(String[] args)
	{
		new myFrame1();
	}

}

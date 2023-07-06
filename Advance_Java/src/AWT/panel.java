package AWT;

import java.awt.*;
import java.awt.event.*;


class pnl_demo extends Frame implements ActionListener
{
	Button b1,b2;
	Button[] btn;
	Panel pnl;
	Checkbox cb1,cb2;
	
	
	pnl_demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(400, 200);
		setLayout(null);
		 
		b1=new Button("HIDE");
		b2=new Button("SHOW");
		pnl=new Panel();
		cb1=new Checkbox("Pen");
		cb2=new Checkbox("Pencil");
		
		
		add(b1);	add(b2);	add(pnl);
		pnl.add(cb1);	pnl.add(cb2);
		
		
		b1.setBounds(100, 100, 100, 20);
		b2.setBounds(220, 100, 100, 20);
		pnl.setBounds(100, 140, 100, 20);
		pnl.setBackground(Color.DARK_GRAY);
		pnl.setSize(220, 220 );
		
		cb1.setBounds(30, 50, 100, 20);
		cb2.setBounds(150, 30, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		btn = new Button[10];
		for(int i=0;i<10;i++)
		{
			btn[i]=new Button(" "+(i+1)  );
			pnl.add(btn[i]);
		}
		
		addWindowListener(new WindowAdapter()
		{

			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			pnl.setVisible(false)   ;
		}
		else if(e.getSource()==b2)
		{
			pnl.setVisible(true);
		}
	}
}
public class panel
{
	public static void main(String[] args)
	{
		new pnl_demo();
	}
}

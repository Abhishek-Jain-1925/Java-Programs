package AWT;

import java.awt.*;
import java.awt.event.*;

class pizza_h extends Frame implements ItemListener, ActionListener {
	Label l1, l2, l3, l4, l5;
	Choice ch;
	Button b1, b2, b3;
	TextField t1, t2, t3;
	int cost = 0;
	int Q = 0;
	int rate = 0;

	pizza_h() {
		setTitle("Pizza Hut");
//super("Pizza Hut");
		setSize(300, 350);
		setLocation(500, 200);
		setFont(new Font("Arial", Font.BOLD, 10));
		l1 = new Label("Pizza Hut Billing System");
		l2 = new Label("Select Pizza Type");
		l3 = new Label("Prize");
		l4 = new Label("Quantity");
		l5 = new Label("Total Cost");

		ch = new Choice();
		b1 = new Button("Total");
		b2 = new Button("Clear");
		b3 = new Button("Exit");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(ch);
		ch.add("Select Type");
		ch.add("Cheeze Pizza");
		ch.add("Corn Pizza");
		ch.add("Veg Pizza");
		ch.add("Speacial Pizza");
		add(b1);
		add(b2);
		add(b3);
		add(t1);
		add(t2);
		add(t3);
		l1.setBounds(20, 40, 500, 30);
		l2.setBounds(50, 80, 80, 30);
		ch.setBounds(140, 80, 120, 30);
		l3.setBounds(50, 120, 80, 30);
		t1.setBounds(140, 120, 100, 30);
		l4.setBounds(50, 160, 80, 30);
		t2.setBounds(140, 160, 100, 30);
		l5.setBounds(50, 200, 80, 30);
		t3.setBounds(140, 200, 100, 30);
		b1.setBounds(50, 250, 60, 30);
		b2.setBounds(120, 250, 60, 30);
		b3.setBounds(190, 250, 60, 30);
		ch.addItemListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setLayout(null);
		setVisible(true);

	}

	public void itemStateChanged(ItemEvent i) {
		if (i.getSource() == ch) {
			if (ch.getSelectedIndex() == 0) {
				t1.setText("0");
			} else if (ch.getSelectedIndex() == 1) {
				t1.setText("100");
			} else if (ch.getSelectedIndex() == 2) {
				t1.setText("125");
			} else if (ch.getSelectedIndex() == 3) {
				t1.setText("51");
			} else if (ch.getSelectedIndex() == 4) {
				t1.setText("150");
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int rate = Integer.parseInt(t1.getText());
			int Q = Integer.parseInt(t2.getText());
			cost = rate * Q;
			t3.setText("" + cost + " Rs /-");
		} else if (e.getSource() == b2) {
			ch.add("");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		} else if (e.getSource() == b3) {
			System.exit(0);
		}
	}
}

class pizza_hut {
	public static void main(String[] args)

	{
		new pizza_h();
	}
}
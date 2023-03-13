package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;
	

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 300);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);
		Font font2 = new Font("함초롬바탕", Font.BOLD, 150);

		JLabel number = new JLabel("0");
		JButton b1 = new JButton("1더하기");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		JButton b2 = new JButton("0으로 초기화");

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});
		JButton b3 = new JButton("1빼기");

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		number.setForeground(Color.red);
		b1.setBackground(Color.green);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.green);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		number.setFont(font2);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		f.setVisible(true);

	}

}

package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(290, 500);
		f.getContentPane().setBackground(Color.black);
		f.setLayout(new FlowLayout());
		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JButton b1 = new JButton("고 려 아 연");
		JButton b2 = new JButton("L G 화 학");
		JButton b3 = new JButton("에 코 프 로 ");
		JButton b4 = new JButton("크롤링 시작");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링5 c = new 네이버증권크롤링5();
				c.naver("010130");

			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링5 c = new 네이버증권크롤링5();
				c.naver("051910");

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링5 c = new 네이버증권크롤링5();
				c.naver("086520");

			}
		});

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.lightGray);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.magenta);
		

		JLabel label = new JLabel("CODE");
		label.setFont(font);
		label.setForeground(Color.white);

		JTextField text = new JTextField(10);
		text.setFont(font);
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String code2 = text.getText();
				네이버증권크롤링5 c = new 네이버증권크롤링5();
				c.naver(code2);

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);

	}

}

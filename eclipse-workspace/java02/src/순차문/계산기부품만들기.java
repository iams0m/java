package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기부품만들기 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("010.png");
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		JTextField text1 = new JTextField(10); //10은 가로 크기
		JTextField text2 = new JTextField(10);
		
		Font font = new Font("d2coding", 1, 20);
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		label2.setForeground(Color.pink);
		label3.setForeground(Color.pink);
		text1.setBackground(Color.pink);
		text2.setBackground(Color.pink);
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		
		f.setVisible(true);
	}

}

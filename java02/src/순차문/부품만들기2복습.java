package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2복습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 900);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("확인");
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JButton b2 = new JButton();
		b2.setText("확인");
		JLabel text2 = new JLabel();
		text2.setText("비밀번호");
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
	
		Font font = new Font("함초롬바탕", 1, 20);
		
		text1.setFont(font);
		text2.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);

	}

}

package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주 써서 RAM에 언제든 사용할 수 있도록 준비되어있음
		//    망치
		//    부품명.기능()
		
		// 2. 쓸 때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 RAM에 저장해두고 사용
		//    벽돌
		//    JFrame f = new Jframe();
		
		JFrame f = new JFrame("숫자맞추기 게임");
		f.setSize(500, 500);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요");
		
		JTextField text = new JTextField(10);
		
		JButton b = new JButton();
		b.setText("숫자를 맞춰보자!");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("함초롬바탕", 1, 20);
		Font font2 = new Font("함초롬바탕", 1, 30);
		
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		l.setFont(font);
		
		text.setFont(font2);
		text.setBackground(Color.pink);
		text.setForeground(Color.blue);
		
		b.setFont(font2);	
		b.setBackground(Color.gray);
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);

	}

}

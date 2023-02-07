package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		//JFrame부품을 만들어 램에 저장
		//JButton부품을 만들어 램에 저장
		//JFrame에 버튼 추가
		//버튼이 추가된 JFrame화면 출력
		
		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("버튼1");
		
		JButton b2 = new JButton();
		b2.setText("버튼2");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("비밀번호");
		
		//JTextField(글자수)
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("굴림", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.white); //버튼의 글자색
		
		b2.setBackground(Color.pink); // 배경색
		b2.setForeground(Color.white); //버튼의 글자색
		
		text1.setForeground(Color.orange);
		text2.setForeground(Color.orange);
	
		ImageIcon icon1 = new ImageIcon("007.png");
		ImageIcon icon2 = new ImageIcon("008.png");
		
		//add는 만들고 나서 써야함
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
		
		
		
	}

}

package 제어문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sun.net.www.content.image.png;

public class 회원가입처리 {

	public static void main(String[] args) {
		//JFrame부품을 만들어 램에 저장
		//JButton부품을 만들어 램에 저장
		//JFrame에 버튼 추가
		//버튼이 추가된 JFrame화면 출력
		
		JFrame f = new JFrame();
		f.setSize(290, 500);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
	
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");
		
		JLabel text2 = new JLabel();
		text2.setText("비밀번호 입력");
		
		JLabel text3 = new JLabel();
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");
		
		JButton b1 = new JButton();
		
		//JTextField(글자수)
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		Font font = new Font("함초롬바탕", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		text3.setFont(font);
		input3.setFont(font);
		text4.setFont(font);
		input4.setFont(font);
		
		b1.setText("회원가입처리");
		
		b1.setBackground(Color.green); // 배경색
		b1.setForeground(Color.white); //버튼의 글자색
		
		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		text3.setForeground(Color.blue);
		text4.setForeground(Color.blue);
		
		
		
		f.add(text1);
		f.add(input1);
		
		f.add(text2);
		f.add(input2);
		
		f.add(text3);
		f.add(input3);
		
		f.add(text4);
		f.add(input4);
		
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리할 내용 코딩해주기
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String tel = input4.getText();
			}
		});
		
		
		f.setVisible(true);
		
		
		
	}

}

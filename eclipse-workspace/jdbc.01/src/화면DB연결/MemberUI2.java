package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("나의 회원가입 화면");
		f.setSize(400,900);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("함초롬바탕", Font.BOLD, 40);
		
		JLabel l1 = new JLabel("<<나의 게시판>>");
		JLabel l2 = new JLabel("게시판 id");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		JLabel l6 = new JLabel("-----------------");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");		
		JButton b3 = new JButton("게시물 검색 완료");			

		f.add(l1);
		f.add(l6);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
			
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		t3.setBackground(Color.yellow);
		t4.setBackground(Color.yellow);
		
		t1.setForeground(Color.magenta);
		t2.setForeground(Color.magenta);
		t3.setForeground(Color.magenta);
		t4.setForeground(Color.magenta);
		
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);

		
		f.setVisible(true);

	}

}

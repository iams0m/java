package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.Bbs2DAO;
import 자바DB연결.BbsDAO;
import 자바DB연결.MemberDAO3;

public class Bbs2UI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("나의 회원가입 화면");
		f.setSize(400,950);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("함초롬바탕", Font.BOLD, 40);
		
		JLabel l1 = new JLabel("<<나의 게시판>>");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		JLabel l6 = new JLabel("-----------------");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성 처리");
		JButton b2 = new JButton("게시물 삭제 처리");		
		JButton b3 = new JButton("게시물 수정 처리");			
		JButton b4 = new JButton("게시물 검색 처리");			

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 검색 완료");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);

				Bbs2DAO dao = new Bbs2DAO();
				BbsVO bag = dao.one(no2);
				if (bag != null) {
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				}else {
					JOptionPane.showMessageDialog(f, "검색결과 없음");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t2.setBackground(Color.yellow);
					t3.setBackground(Color.yellow);
					t4.setBackground(Color.yellow);
				}
			}//action
		});//b4
		
		f.add(l1);
		f.add(l6);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
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
		b4.setFont(font);
			
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
		b4.setBackground(Color.pink);

		
		f.setVisible(true);

	}

}

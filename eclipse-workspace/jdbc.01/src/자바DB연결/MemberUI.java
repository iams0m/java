package 자바DB연결;

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

import org.omg.CORBA.IRObject;

import 자바DB연결.MemberDAO;
import 자바DB연결.MemberDAO2;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.darkGray);
		f.setTitle("나의 회원가입 화면");
		f.setSize(460, 900);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 40);

		JLabel l1 = new JLabel("<<회원가입화면>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수 입력 항목입니다!");
				}

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.insert(id, pw, name, tel);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
				}
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정처리");
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.update(id, tel);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
				}
			}
		});

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
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

		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);

		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);

		f.setVisible(true);

	}

}

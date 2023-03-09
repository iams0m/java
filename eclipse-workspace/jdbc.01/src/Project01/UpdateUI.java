package Project01;

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

public class UpdateUI {
	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("개인회원정보 수정");
		f.setSize(500, 600);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 40);
		Font font2 = new Font("함초롬바탕", Font.BOLD, 30);
		Font font3 = new Font("함초롬바탕", Font.BOLD, 20);

		JLabel l1 = new JLabel("<<<<회원정보 수정>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("생년월일(6자리)");
		JLabel l6 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(8);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(8);
		JTextField t5 = new JTextField(8);

		JButton b1 = new JButton("변경하기");
		JButton b2 = new JButton("변경하기");
		JButton b3 = new JButton("탈퇴하기");
		JButton b4 = new JButton("저장하기");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("회원수정처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String birth = t4.getText();
				String tel = t5.getText();

				JoinDAO dao = new JoinDAO();
				JoinVO bag = new JoinVO();
				
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "비밀번호를 수정합니다.");
				}else {
					JOptionPane.showMessageDialog(f, "회원수정 실패! 다시 입력해주세요.");
				}
			}//action
		});//b1
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String birth = t4.getText();
				String tel = t5.getText();

				JoinDAO dao = new JoinDAO();
				//1.가방을 만들자.
				JoinVO bag = new JoinVO();
				//2.가방에 값을 넣자.
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				//3.가방을 전달하자.
				int result = dao.delete(bag);
				if (result == 5) {
					JOptionPane.showMessageDialog(f, "회원탈퇴가 완료되었습니다.");
				}else {
					JOptionPane.showMessageDialog(f, "빠진 항목이 없는지 다시 확인해주세요.");
				}
			}//action
		});//b3
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정처리");
				String id = t1.getText();
				String pw = t2.getText();
				String tel = t5.getText();

				JoinDAO dao = new JoinDAO();
				
				JoinVO bag = new JoinVO();
				//2.가방에 값을 넣자.
				bag.setId(id);
				bag.setPw(pw);
				bag.setTel(tel);
				//3.가방을 전달하자.
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
				}
			}//action
		});//b4

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(b1);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l6);
		f.add(t5);
		f.add(b2);
		f.add(b3);
		f.add(b4);


		l1.setFont(font);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		t5.setFont(font2);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);

		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		b3.setBackground(Color.lightGray);
		b4.setBackground(Color.green);

		f.setVisible(true);
	}
}

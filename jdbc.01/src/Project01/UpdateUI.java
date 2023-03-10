package Project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.net.aso.l;
import 자바DB연결.MemberDAO3;

public class UpdateUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

	public static void open() {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setTitle("회원정보수정");
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 20);
		Font font2 = new Font("굴림", Font.BOLD, 30);

		JLabel l1 = new JLabel("");
		ImageIcon icon = new ImageIcon("logo.jpg");
		l1.setIcon(icon);
		l1.setBounds(29, 10, 445, 205);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("아이디");
		l2.setBounds(50, 234, 73, 40);
		f.getContentPane().add(l2);

		t1 = new JTextField(10);
		t1.setBounds(177, 227, 260, 47);
		f.getContentPane().add(t1);

		JLabel l3 = new JLabel("비밀번호");
		l3.setBounds(50, 290, 100, 40);
		f.getContentPane().add(l3);

		t2 = new JTextField(10);
		t2.setBounds(177, 283, 260, 47);
		f.getContentPane().add(t2);

		JLabel l4 = new JLabel("이름");
		l4.setBounds(50, 346, 73, 40);
		f.getContentPane().add(l4);

		t3 = new JTextField(10);
		t3.setBounds(177, 339, 260, 47);
		f.getContentPane().add(t3);

		JLabel l5 = new JLabel("생년월일");
		l5.setBounds(50, 402, 100, 40);
		f.getContentPane().add(l5);

		t4 = new JTextField(8);
		t4.setText("6자리");
		t4.setBounds(177, 395, 260, 47);
		f.getContentPane().add(t4);

		JLabel l6 = new JLabel("전화번호");
		l6.setBounds(50, 458, 88, 40);
		f.getContentPane().add(l6);

		t5 = new JTextField(10);
		t5.setText("숫자만 입력");
		t5.setBounds(177, 451, 260, 47);
		f.getContentPane().add(t5);

		JButton b1 = new JButton("회원탈퇴");
		b1.setBounds(50, 508, 88, 33);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		f.getContentPane().add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
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

				int reply = JOptionPane.showConfirmDialog(f, "회원탈퇴를 진행하시겠습니까?", "Confirm Message",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					int result = dao.delete(bag);
					if (result == 0) {
						JOptionPane.showMessageDialog(f, "회원탈퇴 실패! 다시 입력 해주세요.");
						
					}else {
						JOptionPane.showMessageDialog(f, "회원탈퇴가 완료되었습니다. 이용해주셔서 감사합니다!");
						System.exit(0);
					}//result == 0
				}//reply

			}// action
		});// b1

		JButton b2 = new JButton("수정하기");
		b2.setBounds(349, 508, 88, 33);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		f.getContentPane().add(b2);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String id = t1.getText();
				String pw = t2.getText();
				String tel = t5.getText();

				JoinDAO dao = new JoinDAO();
				JoinVO bag = new JoinVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setTel(tel);
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원정보 수정이 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(f, "회원수정 실패! 잘못된 정보입니다.");
				}
			}
		});

		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		t5.setFont(font2);

		f.setVisible(true);
	}
}

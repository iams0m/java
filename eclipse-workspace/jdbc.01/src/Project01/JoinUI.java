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

public class JoinUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("개인회원가입");
		f.setSize(460, 500);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 40);
		Font font2 = new Font("함초롬바탕", Font.BOLD, 30);

		JLabel l1 = new JLabel("개인 회원가입 페이지");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("생년월일(6자리)");
		JLabel l6 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(8);
		JTextField t5 = new JTextField(10);
		t5.setText("-없이");

		JButton b1 = new JButton("회원가입");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String birth = t4.getText();
				String tel = t5.getText();
				
				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수 입력 항목입니다!");
				}

				JoinDAO dao = new JoinDAO();
				JoinVO bag = new JoinVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				int result = dao.insert(bag);
				
				if (result == 0) {
					JOptionPane.showMessageDialog(f, "회원가입 실패! 중복된 아이디입니다.");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 되었습니다.");
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
		f.add(l6);
		f.add(t5);
		f.add(b1);


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
		b1.setFont(font);

		b1.setBackground(Color.green);

		f.setVisible(true);
	}
}

package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(350, 800);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JLabel label1 = new JLabel();
		JLabel id = new JLabel("아이디: ");
		JLabel pw = new JLabel("비밀번호: ");

		ImageIcon icon = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		label1.setIcon(icon);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.green);
		reset.setBackground(Color.green);

		label1.setFont(font);
		id.setFont(font);
		idText.setFont(font);
		pw.setFont(font);
		pwText.setFont(font);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}

			}
		}); // reset add end

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");

			}
		}); // reset add end

		f.add(label1);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}

}

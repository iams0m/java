package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화앨범만들기 {
	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "<더 퍼스트 슬램덩크>", "<타이타닉>", "<아바타: 물의 길>", "<교섭>", "<바빌론>" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(303, 530);
		f.getContentPane().setBackground(Color.pink);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.darkGray);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.setBackground(Color.pink);
		left.setFont(font);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index = index - 1; // index--; index -= 1;
				} else {
					JOptionPane.showMessageDialog(f, "첫번째 순위입니다.");

				}

			}
		});

		JButton right = new JButton(">>");
		right.setBackground(Color.pink);
		right.setFont(font);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index = index + 1; // index--; index -= 1;
				} else {
					JOptionPane.showMessageDialog(f, "마지막 순위입니다.");
				}

			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}

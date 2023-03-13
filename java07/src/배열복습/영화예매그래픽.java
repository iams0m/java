package 배열복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매그래픽버전");
		f.setSize(560, 730);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200];
		ArrayList list = new ArrayList();

		for (int i = 0; i < seat.length; i++) {
			JButton b = new JButton(i + "");
			b.setBackground(Color.white);
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					System.out.println(e.getSource());
					list.add(e.getSource());
					int index = Integer.parseInt(s);
					if (seat[index] == 1) {
						seat[index] = 0;
						JOptionPane.showMessageDialog(f, index + "번 예약취소됨.");
						b.setBackground(Color.white);

					} else {
						seat[index] = 1;
						JOptionPane.showMessageDialog(f, index + "번 좌석이 예매되었습니다.");
						b.setBackground(Color.red);

					}

				}
			});
			f.add(b);
			
		}
		JButton b2 = new JButton("<<<<< 결제하기 >>>>>");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						seatNo = seatNo + " " + i;
					}
				}
				JOptionPane.showMessageDialog(f, "예매한 좌석번호는 " + seatNo);
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + (count * 10000) + "원입니다.");

			}
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		f.setVisible(true);

	}

}

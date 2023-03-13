package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] btn = new JButton[100];

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JLabel result = new JLabel("결과가 보이는 곳");
		result.setForeground(Color.blue);
		result.setFont(font);

		int[] seat = new int[btn.length]; //예약 여부 저장 배열

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand(); // e.getActionCommand():클릭한 버튼의 글자를 가지고 와줌.
					System.out.println(text);
					int no = Integer.parseInt(text);
					if (seat[no] == 1) {
						result.setText("예약 불가");
						result.setForeground(Color.red);
					} else {
						seat[no] = 1;
						result.setText(text + "번 예약완료.");
						btn[no].setBackground(Color.magenta);
						btn[no].setEnabled(false); //버튼 비활성화

					}
				}
			});
		}

		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.cyan);
		total.setFont(font);

		f.add(total);

		total.addActionListener(new ActionListener() {

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
				JOptionPane.showMessageDialog(f, "총 " + count + "개 선택하였습니다.");
				JOptionPane.showMessageDialog(f, "예매한 좌석번호는 " + seatNo + " 입니다.");
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + (count * 10000) + "원 입니다.");
			}
		});

		f.setVisible(true);

	}

}

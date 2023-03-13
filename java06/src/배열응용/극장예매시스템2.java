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

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.magenta);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 추가한 순서대로 f에 붙는다.

		JButton[] btn = new JButton[100];

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setFont(font);

		// 예약 여부를 저장하는 배열
		int[] seat = new int[btn.length]; // {1,0,0,0,0,0,0,0,0,0}
		// 각 자리에 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand(); // "0"
					System.out.println(text);
					int no = Integer.parseInt(text); // "0" --> 0
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능!!
					if (seat[no] == 1) { // 예약 완료
						result.setText("예약 불가");
						result.setForeground(Color.blue);
					} else { // 예약 가능
						seat[no] = 1; // 예약좌석은 1로 변경!
						result.setText(text + "번 예약완료.");
						btn[no].setBackground(Color.orange);
						btn[no].setEnabled(false);
					}

				}
			});
		}

		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);

		f.add(total);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 배열 안에 저장된 값이 1인지 체크해서 카운트
				int count = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						seatNo = seatNo + " " + i;
					}
				}
				JOptionPane.showMessageDialog(f, "예매한 좌석번호는 " + seatNo);
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + (count * 10000) + "원");
			}
		});

		f.setVisible(true);

	}

}
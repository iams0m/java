package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 프레임 만들기
		JFrame f = new JFrame();

		// 프레임 설정
		f.setSize(1200, 800);
		f.getContentPane().setBackground(Color.pink);

		// 레이아웃 부품을 설정하지 않음
		f.setLayout(null);

		// 버튼을 넣을 배열 먼저 만들기(500개)
		// 기본형이 아닌 데이터는 참조형
		// 참조형은 배열에 null로 초기화
		// {null, null, null , ...};
		JButton[] buttons = new JButton[500];

		// 버튼을 500개 만들어서 배열에 넣어주기(반복문)
		Color[] colors = { Color.red, Color.LIGHT_GRAY, Color.MAGENTA, Color.orange, Color.green };
		Random r = new Random(42);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "번 버튼");
			int x = r.nextInt(1000); // 가로 위치
			int y = r.nextInt(800); // 세로 위치
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}

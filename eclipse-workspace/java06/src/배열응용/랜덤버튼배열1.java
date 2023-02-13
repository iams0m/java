package 배열응용;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열1 {

	public static void main(String[] args) {
		//배열에는 기본형만 들어가는 것이 아니고 참조형도 가능
		//정수, 실수, 문자1, 논리 + String, JButton, ...
		//기본형은 변수에 값이 저장
		//참조형은 무조건 주소가 저장
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.yellow);
		f.setTitle("나의 버튼들....200개");
		f.setSize(1200,800);
		
		//버튼 200개를 만들어 배열에 저장
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼 " + i);
		}
		
		//위치를 지정해서 넣어주자
		f.setLayout(null); //위치 자동으로 잡아주는 부품 안씀
		//null ==> 조립해서 넣을 부품의 주소가 램에 없음
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
//			int x = r.nextInt(1000);
//			int y = r.nextInt(800);
//			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBounds(r.nextInt(1000),r.nextInt(800), 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}

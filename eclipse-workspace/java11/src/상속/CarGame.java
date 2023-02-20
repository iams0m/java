package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100); // jframe에 붙은 위치 지정
			add(label);
		}
		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100 + 45
				label.setBounds(x, y, 100, 100); // 다시 위치 지정
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public CarGame() {
		setTitle("나의 자동차 경주 게임");
		setSize(600, 500);
		MyThread car1 = new MyThread("car1.png", 50, 50);
		MyThread car2 = new MyThread("car2.png", 50, 150);
		MyThread car3 = new MyThread("car3.png", 50, 250);
		car1.start();
		car2.start();
		car3.start();
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame name = new CarGame();
	}

}
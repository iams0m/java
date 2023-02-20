package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, day;

	public static void main(String[] args) {
		new 스레드그래픽(); // ---1
		// 객체생성시 클래스 이름과 동일한 메서드를 자동 호출
		// 생성자 메서드를 자동 호출
	}

	public 스레드그래픽() { // ----------------2
		setTitle("내 스레드 그래픽");
		setSize(700, 500);
		getContentPane().setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		count = new JLabel("카운터");

		ImageIcon icon = new ImageIcon("가지.png");
		image = new JLabel(icon);

		day = new JLabel("시분초");

		count.setFont(font);
		day.setFont(font);

		add(count);
		add(image);
		add(day);

		이미지스레드2 img = new 이미지스레드2();
		카운터스레드2 counter = new 카운터스레드2();
		타이머스레드2 timer = new 타이머스레드2();

		img.start();
		counter.start();
		timer.start();

		setVisible(true);
	}

	// 내부클래스(inner class) : 전역변수 공유
	public class 카운터스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("CPU 연결 문제 생김");
				}

			}
		}
	}

	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] images = { "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png", "가지.png", "감자.png", "딸기.png",
					"사과.png", "수박.png", "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png" };
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon2 = new ImageIcon(images[i]);
				image.setIcon(icon2);
			}
			try {
				Thread.sleep(1000); // 1초 재워라
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}

		}
	}

	// 내부클래스(inner class) : 전역변수 공유
	public class 타이머스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				day.setText(date + "");
				try {
					Thread.sleep(1000); // 1초 재워라
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}

			}
		}

	}

}

package 상속;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽2 extends JFrame {
	JLabel count, image, time; //전역변수

	public static void main(String[] args) {
		스레드그래픽2 f = new 스레드그래픽2();
		//객체생성시 클래스 이름과 동일한 메서드 자동호출
		//생성자 메서드 자동호출
	}

	public 스레드그래픽2() {
		setTitle("내 스레드 그래픽");
		setSize(650, 500);
		getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		Font font = new Font("함초롬바탕", Font.BOLD, 30);
		
		count = new JLabel("카운터");
		
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		
		time = new JLabel("시분초");
		
		count.setFont(font);
		time.setFont(font);

		add(count);
		add(image);
		add(time);

		타이머스레드2 time2 = new 타이머스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		카운터스레드2 count2 = new 카운터스레드2();

		count2.start();
		image2.start();
		time2.start();

		setVisible(true);
	}
	public class 카운터스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("Count : " + i);
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}

			}
		}
	}

	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				SimpleDateFormat format1;
				format1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
				time.setText("표준시간 : " + format1.format(date));
				try {
					Thread.sleep(1000); // 1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = { "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png", "가지.png", "감자.png", "딸기.png",
					"사과.png", "수박.png", "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png", "가지.png", "감자.png", "딸기.png",
					"사과.png", "수박.png", "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png", "가지.png", "감자.png", "딸기.png",
					"사과.png", "수박.png", "가지.png", "감자.png", "딸기.png",
					"사과.png", "수박.png"};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

}
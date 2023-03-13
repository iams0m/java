package 상속응용;

import java.awt.FontFormatException;
import java.util.Date;

public class 이미지스레드 extends Thread {
	@Override
	public void run() {
		String[] image = { "가지.png", "감자.png", "딸기.png", "사과.png", "수박.png" };
		for (int i = 0; i < image.length; i++) {
			System.out.println("이미지>> " + image[i]);
		}
		try {
			Thread.sleep(1000); // 1초 재워라
		} catch (Exception e) {
			System.out.println("cpu 연결 문제 생김");
		}

	}
}

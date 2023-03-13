package 상속;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 생김");
			}

		}
	}
}

package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class MyThread extends Thread {
	int x, y;
	JLabel label;

	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100); // jframe에 붙은 위치 지정
	}

	@Override
	public void run() {
		// 동시에 실행하고 싶은 내용
		// 모든 스레드를 오른쪽으로 움직이게 하기 => x축 늘려주기
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 100, 100);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

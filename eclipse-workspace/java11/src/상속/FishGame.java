package 상속;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 상속.CarGame.MyThread;

public class FishGame extends JFrame {
	public class MyThread2 extends Thread{
	int x, y;
	JLabel label;
	public MyThread2(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
		add(label);
	}
	
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 100, 100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	public FishGame() {
		setTitle("물고기 게임");
		setSize(600,500);
		getContentPane().setBackground(Color.blue);
		MyThread2 fish1 = new MyThread2("수달.png", 50, 50);
		MyThread2 fish2 = new MyThread2("불가사리1.png", 50, 150);
		MyThread2 fish3 = new MyThread2("불가사리2.png", 50, 250);
		fish1.start();
		fish2.start();
		fish3.start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FishGame name = new FishGame();

	}
}


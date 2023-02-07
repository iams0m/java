package 순차문;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 1; i < 101; i++) {
			JButton b = new JButton(i + "번");
			f.add(b);
		}
		f.setVisible(true);

	}

}

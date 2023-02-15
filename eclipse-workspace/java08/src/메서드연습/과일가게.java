package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 과일가게 {
	static int count;
	static int count1;
	static int count2;
	static int count3;
	final static int price1 = 5000;
	final static int price2 = 3000;
	final static int price3 = 10000;
	

	public static void main(String[] args) {
		JFrame f = new JFrame("과일 구매");
		f.setSize(550, 550);
		f.getContentPane().setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JButton b1 = new JButton("파인애플");
		b1.setBackground(Color.yellow);
		b1.setBorderPainted(false);

		JButton b2 = new JButton("사과");
		b2.setBackground(Color.green);
		b2.setBorderPainted(false);

		JButton b3 = new JButton("딸기");
		b3.setBackground(Color.pink);
		b3.setBorderPainted(false);

		JLabel textLabel = new JLabel("개수 : ");
		JLabel countLabel = new JLabel("0개");
		JLabel centerLabel = new JLabel();
		ImageIcon icon = new ImageIcon("채소들.png");
		centerLabel.setIcon(icon);
		JLabel resultLabel = new JLabel("총 결제금액 : 0원");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("파인애플.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("파인애플 : " + count1 + " 사과 : " + count2 + " 딸기 : " + count3);
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				resultLabel.setText("총 결제금액 : " + total + "원");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("사과.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count2++;
				f.setTitle("파인애플 : " + count1 + " 사과 : " + count2 + " 딸기 : " + count3);
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				resultLabel.setText("총 결제금액 : " + total + "원");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("딸기.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count3++;
				f.setTitle("파인애플 : " + count1 + " 사과 : " + count2 + " 딸기 : " + count3);
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				resultLabel.setText("총 결제금액 : " + total + "원");
			}
		});

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		textLabel.setFont(font);
		countLabel.setFont(font);
		resultLabel.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(centerLabel);
		f.add(resultLabel);

		f.setVisible(true);

	}

}

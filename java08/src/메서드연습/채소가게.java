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

public class 채소가게 {

	static int count; //0으로 초기화, 전역변수
	final static int price = 5000; //변경불가, 상수
	//상수변수를 쓸 때는 잘보이기 위해서 변수명을 모두 대문자로 작성!
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(550, 550);
		f.getContentPane().setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JButton b1 = new JButton("가지");
		b1.setBackground(Color.lightGray);
		b1.setBorderPainted(false);

		JButton b2 = new JButton("감자");
		b2.setBackground(Color.orange);
		b2.setBorderPainted(false);
		
		JButton b3 = new JButton("바나나");
		b3.setBackground(Color.yellow);
		b3.setBorderPainted(false);

		JLabel textLabel = new JLabel("개수 : ");
		JLabel countLabel = new JLabel("0개");
		JLabel centerLabel = new JLabel();
		ImageIcon icon = new ImageIcon("채소들.png");
		centerLabel.setIcon(icon);
		
		JLabel resultLabel = new JLabel("결제금액 : 0원");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("가지.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				resultLabel.setText("결제금액 : " + (count * price) + "원");
				

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("감자.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				resultLabel.setText("결제금액 : " + (count * price) + "원");
				
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("바나나.png");
				centerLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				resultLabel.setText("결제금액 : " + (count * price) + "원");
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

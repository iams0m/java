package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300, 600);
		f.setLayout(new FlowLayout());

		Font font = new Font("함초롬바탕", Font.BOLD, 30);
		JLabel label1 = new JLabel("문장을 넣으세요");
		JTextArea area = new JTextArea(7, 10);
		JButton b1 = new JButton("Click");
		JButton b2 = new JButton("Pad Color");
		JButton b3 = new JButton("Text Color");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
				area.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.pink);
			}
		});
	
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.blue);
			}
		});

		label1.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		area.setBackground(Color.DARK_GRAY);
		area.setForeground(Color.white);
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		b3.setBackground(Color.gray);

		f.add(label1);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setVisible(true);

	}

}

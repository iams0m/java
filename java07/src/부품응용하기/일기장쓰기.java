package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	public void open() {
		// System.out.println("화면이 open");
		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성화면");
		f.setSize(350, 600);
		f.getContentPane().setBackground(Color.yellow);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("함초롬바탕", Font.BOLD, 30);

		JLabel date = new JLabel("오늘의 날짜");
		JLabel title = new JLabel("오늘의 제목");
		JLabel content = new JLabel("오늘의 내용");
		JButton b = new JButton("파일에 일기 저장");
		b.setBackground(Color.pink);

		JTextField date2 = new JTextField(10);
		JTextField title2 = new JTextField(10);
		JTextArea content2 = new JTextArea(5, 10);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String date3 = date2.getText();
				String title3 = title2.getText();
				String content3 = content2.getText();
				//System.out.println(date3 + " " + title3 + " " + content3);
				//파일도 만들어주고, 자바프로그램과 file간에 연결통로(stream)을 만들어줌
				//외부에 있는 파일, 네트워크나 CPU등을 자바에서 연결할 때에는 아주 위험한 상황이라고 인식!
				//이렇게 위험한 상황에서 만약 문제가 발새하면 어떻게 처리할지를 꼭 써주어야 함
				try {
					FileWriter file = new FileWriter(date3 + ".txt");
					file.write(date3 + "\n");
					file.write(title3 + "\n");
					file.write(content3 + "\n");
					file.close();
				} catch (Exception e2) {
					System.out.println("파일로 저장하는 중 문제 발생!");
				}
				
			}
		});

		date.setFont(font);
		title.setFont(font);
		content.setFont(font);
		date2.setFont(font);
		title2.setFont(font);
		content2.setFont(font);
		b.setFont(new Font("함초롬바탕", font.BOLD, 40));

		f.add(date);
		f.add(date2);
		f.add(title);
		f.add(title2);
		f.add(content);
		f.add(content2);
		f.add(b);

		f.setVisible(true);
	}
}

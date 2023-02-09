package 제어문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.sun.org.apache.bcel.internal.generic.L2D;
import com.sun.xml.internal.ws.assembler.jaxws.AddressingTubeFactory;

public class kpop인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,950);
		f.getContentPane().setBackground(Color.pink);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel();
		l1.setText("K-pop 인기 투표");
		
		JButton b1 = new JButton();
		ImageIcon icon = new ImageIcon("2.jpg");
		b1.setIcon(icon);
		
		JLabel l2 = new JLabel();
		l2.setText("1.Ditto - NewJeans");
		JLabel l5 = new JLabel();
		
		JButton b2 = new JButton();
		b2.setIcon(icon);
		
		JLabel l3 = new JLabel();
		l3.setText("2.OMG - NewJeans");
		JLabel l6 = new JLabel();
		
		JButton b3 = new JButton();
		ImageIcon icon2 = new ImageIcon("nwjns.jpg");
		b3.setIcon(icon2);
		
		JLabel l4 = new JLabel();
		l4.setText("3.Hype boy - NewJeans");
		JLabel l7 = new JLabel();
		
		Font font = new Font("함초롬바탕", 1, 20);
		Font font2 = new Font("함초롬바탕", font.ITALIC , 30);
		l1.setFont(font2);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		l7.setFont(font);
		l5.setForeground(Color.red);
		l6.setForeground(Color.red);
		l7.setForeground(Color.red);
		
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		f.add(b2);
		f.add(l3);
		f.add(l6);
		f.add(b3);
		f.add(l4);
		f.add(l7);
	
		b1.addActionListener(new ActionListener() {
			int newjeans1 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용을 써주세요.
				newjeans1++;
				l5.setText(newjeans1 + "표");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			int newjeans2 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				newjeans2++;
				l6.setText(newjeans2 + "표");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			int newjeans3 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				newjeans3++;
				l7.setText(newjeans3 + "표");
			}
		});
		
		f.setVisible(true);
	}

}

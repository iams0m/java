package Project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAKey;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.net.aso.l;

public class MainUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setTitle("회원 전용");
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 40);

		JLabel l1 = new JLabel("");
		ImageIcon icon = new ImageIcon("logo.jpg");
		l1.setIcon(icon);
		l1.setBounds(29, 10, 445, 205);
		f.getContentPane().add(l1);

		JButton b1 = new JButton("회원가입");
		b1.setBounds(120, 200, 250, 50);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("정보수정");
		b2.setBounds(120, 300, 250, 50);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		f.getContentPane().add(b2);
		
		b1.setFont(font);
		b2.setFont(font);
		
		f.setVisible(true);
	}
}

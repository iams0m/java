package Project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import oracle.net.aso.b;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("고객 관리 페이지");
		f.setSize(900, 900);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		
		Font font = new Font("함초롬바탕", Font.BOLD, 20);
		
		JLabel l1 = new JLabel("고객 관리");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(l1, BorderLayout.NORTH);
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		JTextField t1 = new JTextField("아이디");
		JTextField t2 = new JTextField("비밀번호");
		JTextField t3 = new JTextField("이름");
		JTextField t4 = new JTextField("생년월일");
		JTextField t5 = new JTextField("전화번호");
		JTextField t_id = new JTextField(10);
		JTextField t_pw = new JTextField(10);
		JTextField t_name = new JTextField(10);
		JTextField t_birth = new JTextField(10);
		JTextField t_tel = new JTextField(10);
		
		JButton b1 = new JButton("등록");
		JButton b2 = new JButton("수정");
		JButton b3 = new JButton("삭제");
		JButton b4 = new JButton("검색");
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
				
				
			}
		});
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t_id.setFont(font);
		t_pw.setFont(font);
		t_name.setFont(font);
		t_birth.setFont(font);
		t_tel.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		Color color = new Color(0, 204, 0);
		t1.setBackground(color);
		t2.setBackground(color);
		t3.setBackground(color);
		t4.setBackground(color);
		t5.setBackground(color);
		b1.setBackground(color.black);
		b2.setBackground(color.black);
		b3.setBackground(color.black);
		b4.setBackground(color.black);
		
		b1.setForeground(color.white);
		b2.setForeground(color.white);
		b3.setForeground(color.white);
		b4.setForeground(color.white);

		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t_id.setHorizontalAlignment(SwingConstants.CENTER);
		t_pw.setHorizontalAlignment(SwingConstants.CENTER);
		t_name.setHorizontalAlignment(SwingConstants.CENTER);
		t_birth.setHorizontalAlignment(SwingConstants.CENTER);
		t_tel.setHorizontalAlignment(SwingConstants.CENTER);
				
		
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		f.getContentPane().add(t4);
		f.getContentPane().add(t5);
		f.getContentPane().add(t_id);
		f.getContentPane().add(t_pw);
		f.getContentPane().add(t_name);
		f.getContentPane().add(t_birth);
		f.getContentPane().add(t_tel);

		JoinDAO dao = new JoinDAO();
		ArrayList<JoinVO> list = dao.list();
		
		String[] header = {"아이디", "비밀번호", "이름", "생년월일", "전화번호"};
		
		
		Object[][] all = new String[list.size()][5];
		for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getBirth();
				all[i][4] = list.get(i).getTel();
		}
		
		JTable table = new JTable(all, header);
		
		JScrollPane scroll = new JScrollPane(table);
		table.setFont(new Font("굴림", Font.BOLD, 16));
		f.setLayout(new FlowLayout());
		panel.add(scroll);
		
		f.getContentPane().add(b1, BorderLayout.SOUTH);
		f.getContentPane().add(b2, BorderLayout.SOUTH);
		f.getContentPane().add(b3, BorderLayout.SOUTH);
		f.getContentPane().add(b4, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}

}

package Project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Project01.MemberDAO;
import Project01.MemberVO;

public class ManageUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t_id;
	private static JTextField t_pw;
	private static JTextField t_name;
	private static JTextField t_birth;
	private static JTextField t_tel;
	private static JTable table;
	private static JScrollPane scroll;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원 관리");
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("고객관리");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		l1.setBounds(300, 25, 600, 65);
		f.getContentPane().add(l1);

		Font font = new Font("굴림", Font.BOLD, 17);
		Font font2 = new Font("굴림", Font.BOLD, 25);

		t1 = new JTextField("아이디");
		t_id = new JTextField(10);
		t2 = new JTextField("비밀번호");
		t_pw = new JTextField(10);
		t3 = new JTextField("이름");
		t_name = new JTextField(10);
		t4 = new JTextField("생년월일");
		t_birth = new JTextField(10);
		t5 = new JTextField("전화번호");
		t_tel = new JTextField(10);

		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		t5.setFont(font2);
		t_id.setFont(font2);
		t_pw.setFont(font2);
		t_name.setFont(font2);
		t_birth.setFont(font2);
		t_tel.setFont(font2);

		Color color = new Color(102, 255, 102);
		t1.setBackground(color);
		t2.setBackground(color);
		t3.setBackground(color);
		t4.setBackground(color);
		t5.setBackground(color);

		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);

		t1.setBounds(40, 100, 140, 50);
		t_id.setBounds(180, 100, 170, 50);
		t2.setBounds(360, 100, 140, 50);
		t_pw.setBounds(500, 100, 260, 50);
		t3.setBounds(780, 100, 200, 50);
		t_name.setBounds(980, 100, 185, 50);
		t4.setBounds(40, 150, 140, 50);
		t_birth.setBounds(180, 150, 170, 50);
		t5.setBounds(360, 150, 140, 50);
		t_tel.setBounds(500, 150, 260, 50);

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
		f.getContentPane().add(t_id);
		f.getContentPane().add(t2);
		f.getContentPane().add(t_pw);
		f.getContentPane().add(t3);
		f.getContentPane().add(t_name);
		f.getContentPane().add(t4);
		f.getContentPane().add(t_birth);
		f.getContentPane().add(t5);
		f.getContentPane().add(t_tel);

		JButton b1 = new JButton("등록");
		JButton b2 = new JButton("검색");
		JButton b3 = new JButton("수정");
		JButton b4 = new JButton("삭제");
		JButton b5 = new JButton("리셋");

		Font font3 = new Font("굴림", font.BOLD, 20);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);
		b5.setFont(font3);

		b1.setBackground(color.darkGray);
		b2.setBackground(color.darkGray);
		b3.setBackground(color.darkGray);
		b4.setBackground(color.darkGray);
		b5.setBackground(color.darkGray);

		b1.setForeground(color.white);
		b2.setForeground(color.white);
		b3.setForeground(color.white);
		b4.setForeground(color.white);
		b5.setForeground(color.white);

		b1.setBounds(368, 210, 85, 50);
		b2.setBounds(452, 210, 85, 50);
		b3.setBounds(534, 210, 85, 50);
		b4.setBounds(615, 210, 85, 50);
		b5.setBounds(697, 210, 85, 50);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);

		String[] header = { "아이디", "비밀번호", "이름", "생년월일", "전화번호" };
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();
		Object[][] all = new String[list.size()][5];
		for (int i = 0; i < all.length; i++) {
			all[i][0] = list.get(i).getId();
			all[i][1] = list.get(i).getPw();
			all[i][2] = list.get(i).getName();
			all[i][3] = list.get(i).getBirth();
			all[i][4] = list.get(i).getTel();
		}

		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색 결과는 전체 " + list.size() + "개 입니다.");

			for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getBirth();
				all[i][4] = list.get(i).getTel();
			}
		} // else
		JPanel panel = new JPanel();
		panel.setBounds(20, 270, 1145, 580);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		table = new JTable(all, header);
		scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(scroll);
		scroll.setSize(1145, 580);
		table.setFont(font);

		b1.addActionListener(new ActionListener() {// 등록

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scroll);
				panel.repaint();
				String id = t_id.getText();
				String pw = t_pw.getText();
				String name = t_name.getText();
				String birth = t_birth.getText();
				String tel = t_tel.getText();

				if (id.equals("")) {
					JOptionPane.showMessageDialog(f, "ID는 필수 입력 항목입니다!");
				}
				MemberDAO dao = new MemberDAO();
				MemberVO bag = new MemberVO();

				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				int result = dao.insert(bag);

				if (result == 0) {
					JOptionPane.showMessageDialog(f, "고객 등록 실패!");
				} else {
					JOptionPane.showMessageDialog(f, "고객 등록이 완료되었습니다.");
					t_id.setText("");
					t_pw.setText("");
					t_name.setText("");
					t_birth.setText("");
					t_tel.setText("");
				}

				String[] header = { "아이디", "비밀번호", "이름", "생년월일", "전화번호" };
				MemberDAO dao2 = new MemberDAO();
				ArrayList<MemberVO> list = dao2.list();
				Object[][] all = new String[list.size()][5];
				for (int i = 0; i < all.length; i++) {
					all[i][0] = list.get(i).getId();
					all[i][1] = list.get(i).getPw();
					all[i][2] = list.get(i).getName();
					all[i][3] = list.get(i).getBirth();
					all[i][4] = list.get(i).getTel();
				}

				table = new JTable(all, header);
				scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				panel.add(scroll);
				panel.updateUI();
				scroll.setSize(1145, 580);
				table.setFont(font);
			}
		});

		b2.addActionListener(new ActionListener() {// 검색

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("검색할 회원의 ID를 입력하세요.");

				MemberDAO dao = new MemberDAO();// 기능 모음집 호출
				MemberVO bag = dao.search(id);// 데이터 패킷 주머니 생성
				t_id.setText(bag.getId());
				t_pw.setText(bag.getPw());
				t_name.setText(bag.getName());
				t_birth.setText(bag.getBirth());
				t_tel.setText(bag.getTel());
				JOptionPane.showMessageDialog(f, "검색 결과 : [" + bag.getId() + " " + bag.getPw() + " " + bag.getName()
						+ " " + bag.getBirth() + " " + bag.getTel() + "]");
			}
		});

		b3.addActionListener(new ActionListener() {// 수정

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scroll);
				panel.repaint();
				String id = t_id.getText();
				String pw = t_pw.getText();
				String tel = t_tel.getText();

				MemberDAO dao = new MemberDAO();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setTel(tel);
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "고객정보 수정이 완료되었습니다.");
				} else {
					JOptionPane.showMessageDialog(f, "고객수정 실패! 잘못된 아이디입니다.");
				}

				String[] header = { "아이디", "비밀번호", "이름", "생년월일", "전화번호" };
				MemberDAO dao3 = new MemberDAO();
				ArrayList<MemberVO> list = dao3.list();
				Object[][] all = new String[list.size()][5];
				for (int i = 0; i < all.length; i++) {
					all[i][0] = list.get(i).getId();
					all[i][1] = list.get(i).getPw();
					all[i][2] = list.get(i).getName();
					all[i][3] = list.get(i).getBirth();
					all[i][4] = list.get(i).getTel();
				}

				table = new JTable(all, header);
				scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				panel.add(scroll);
				panel.updateUI();
				scroll.setSize(1145, 580);
				table.setFont(font);
			}
		});

		b4.addActionListener(new ActionListener() {// 삭제

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scroll);
				panel.repaint();
				String id = JOptionPane.showInputDialog("삭제할 회원ID를 입력하세요.");
				MemberDAO dao = new MemberDAO(); // 기능 모음집 호출
				int result = dao.delete(id); // 삭제 기능 실행
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "삭제한 회원의 ID는 " + id + "입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "존재하지 않는 회원입니다!");
				}

				String[] header = { "아이디", "비밀번호", "이름", "생년월일", "전화번호" };
				MemberDAO dao3 = new MemberDAO();
				ArrayList<MemberVO> list = dao3.list();
				Object[][] all = new String[list.size()][5];
				for (int i = 0; i < all.length; i++) {
					all[i][0] = list.get(i).getId();
					all[i][1] = list.get(i).getPw();
					all[i][2] = list.get(i).getName();
					all[i][3] = list.get(i).getBirth();
					all[i][4] = list.get(i).getTel();
				}

				table = new JTable(all, header);
				scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				panel.add(scroll);
				panel.updateUI();
				scroll.setSize(1145, 580);
				table.setFont(font);

			}
		});

		b5.addActionListener(new ActionListener() {// 리셋

			@Override
			public void actionPerformed(ActionEvent e) {
				t_id.setText(null);
				t_pw.setText(null);
				t_name.setText(null);
				t_birth.setText(null);
				t_tel.setText(null);
			}
		});

		f.setVisible(true);
	}// main

}

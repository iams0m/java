package Project01;

import javax.swing.JOptionPane;

public class UpdateUITest {

	public static void main(String[] args) {
		String pw = JOptionPane.showInputDialog("회원정보를 수정하시려면 비밀번호를 입력하셔야 합니다.");
		
		JoinDAO dao = new JoinDAO();
		JoinVO bag = new JoinVO();
		bag.setPw(pw);
		
		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "회원정보를 수정합니다.");
			UpdateUI cus = new UpdateUI();
			cus.open();
		}else {
			JOptionPane.showMessageDialog(null, "잘못된 비밀번호입니다.");
		}
		
	}

}

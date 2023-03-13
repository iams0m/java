package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		int n1 = 0; //아이유
		int n2 = 0; //뉴진스
		int n3 = 0; //BTS
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표를 해주세요. 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				n1++;
			}else if (data.equals("2")) {
				n2++;
			}else if (data.equals("3")) {
				n3++;
			}
		}
		
			System.out.println("아이유 득표수 >> " + n1 + "표");
			System.out.println("뉴진스 득표수 >> " + n2 + "표");
			System.out.println("BTS 득표수 >> " + n3 + "표");
	}

}

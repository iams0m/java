package 제어문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		int n1 = 0; // 아이유
		int n2 = 0; // 뉴진스
		int n3 = 0; // BTS

		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템\n");

		while (true) {
			System.out.print("1)아이유 2)뉴진스 3)BTS 4)종료 >> ");
			int choice = sc.nextInt(); // "2" --> 2

			if (choice == 4) {// 4번부터 넣어주기
				System.out.println("인기투표를 종료합니다.");
				break;
			} else if (choice == 1) {
				n1++;
			} else if (choice == 2) {
				n2++;
			} else if (choice == 3) {
				n3++;
			} else {
				System.out.println("없는 번호입니다.");
			}
		} // while
		sc.close();
		System.out.println("아이유 : " + n1 + "표");
		System.out.println("뉴진스 : " + n2 + "표");
		System.out.println("BTS : " + n3 + "표");
	}

}

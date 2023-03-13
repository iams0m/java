package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 입력받아배열넣기확인문제 {

	public static void main(String[] args) {
		// 작년에 가고 싶었던 세 곳을 입력받아 넣으세요.(제주도, 양양, 속초)
		// 올해에 가고 싶었던 세 곳을 입력받아 넣으세요.(제주도, 부산, 울산)
		// 1. 작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳인가?
		Scanner sc = new Scanner(System.in);

		String[] data1 = new String[3];
		String[] data2 = new String[3];

		for (int i = 0; i < data1.length; i++) {
			System.out.print("작년에 가고 싶었던 곳을 입력하세요.");
			data1[i] = sc.next();
		}

		for (int i = 0; i < data2.length; i++) {
			System.out.print("올해 가고 싶었던 곳을 입력하세요.");
			data2[i] = sc.next();
		}

		for (int i = 0; i < data2.length; i++) {
			if (data1[i].equals(data2[i])) {
				System.out.println(data1[i]);
			}
		}
		sc.close();
	}

}

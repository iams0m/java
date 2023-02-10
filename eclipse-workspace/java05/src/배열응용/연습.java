
package 배열응용;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제1
		int[] data = new int[5];
		for (int i = 0; i < data.length; i++) {
			System.out.print("정수를 입력하세요.");
			data[i] = sc.nextInt();
		}
		System.out.println("첫번째값과 세번째값의 합은  " + (data[0] + data[2]));
		System.out.println();

		// 문제2
		String[] data2 = new String[3];
		for (int i = 0; i < data2.length; i++) {
			System.out.println("값을 입력하세요.");
			data2[i] = sc.next();
		}
		System.out.println(data2[0] + "보다는 " + data2[1]);

		sc.close();
	}

}

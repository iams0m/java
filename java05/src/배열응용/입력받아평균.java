package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서 저장공간에 넣고싶을 때 배열 사용
		// 1. 배열 만들기
		int[] jumsu = new int[5];

		// 배열에 값을 넣을 때는 index 필요 ==> i가 있는 for문 사용해야함
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("점수 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.println(x + " ");
		}
		System.out.println();

		// 1. 점수의 총합과 평균을 구해보세요.
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += jumsu[i]
		}

		double avg = (double) sum / jumsu.length;

		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

		// 2. 300이상 되는 숫자만 찾아서 합계를 구해보세요.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 숫자의 합계 : " + sum2);

		// 3. 심화문제, 300이상 되는 위치인 index를 프린트
		// ==> 해당 인덱스 값이 300이상인지 조건 체크 --> i 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println(i + "번째 값은 300이상입니다.");
			}
		}
	}

}

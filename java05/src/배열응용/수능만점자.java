package 배열응용;

import java.util.Random;

import javax.security.auth.x500.X500Principal;

public class 수능만점자 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000]; // 10000명의 점수 처리
		Random r = new Random(42); // 랜덤으로 10000명의 값 넣어주기
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 점수의 범위 : 0~450
		}

		// 1. 수능 만점자 수
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				count++;
				System.out.println(count + ": 만점자 번호는 " + i + "번");
			} // if
		} // for

		System.out.println("=> 전체 만점자 수는 " + count + "명 입니다.");
		System.out.println();

		// 2. 0점 받은 학생 수
		int count2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 0) {
				count2++;
			} // if
		} // for
		System.out.println("0점은 " + count2 + "명 입니다.");
		System.out.println();

		// 3. 수능 점수의 평균
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		} // for
		double avg = (double) sum / jumsu.length;
		System.out.println("점수의 평균은 " + avg + "점 입니다.");
		System.out.println();

		// 4. 평균보다 +-50점인 학생 수
		int count3 = 0;
		for (int x : jumsu) {
			if ((avg - 50 <= x) & (x <= avg + 50)) {
				count3++;
			}
		}
		System.out.println("평균보다 +-50점인 학생은 " + count3 + "명 입니다.");
		
		
		// 5. 상위 30%값 구하기 => 전체 10000명의 값 중 상위 30%의 값을 구하고, 그 값보다 크거나 같은 값을 추출, 3000등의 값 구하기
	}

}

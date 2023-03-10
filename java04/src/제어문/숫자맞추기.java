package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(10); //값의 범위 : 0~9
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.print("생각한 값 입력(0~9) >> ");
			int data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("총 시도 횟수는 " + count + "번 입니다");
				System.out.println("프로그램을 종료합니다.");
				break; //정답을 맞추면 프로그램을 종료
			} else { //정답을 맞추지 못하면 계속 프로그램 실행
				System.out.println("오답입니다.");
				System.out.println("총 시도 횟수는 " + count + "번 입니다");
				System.out.println("다시 시도해주세요!");
				if (data > target) { //오답일 때 힌트
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작습니다.");
				}
			}
		}

		sc.close();

	}

}

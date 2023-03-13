package 제어문;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무 값이나 발생시키는 부품 ==> Random
		// r.nextInt(45) : 0~44
		Random r = new Random(); // seed값
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또번호 : " + (r.nextInt(45)+1)); // 0~44 +1 => 1~45
//			}

		for (int i = 0; i <6; i++) {
			System.out.println("로또번호(2~10) : " + (r.nextInt(9)+2)); // 0~8 +2 => 2~10
		}

//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또번호(3~30) : " + (r.nextInt(28) + 3));
			// 0~27 +3 => 3~30
		}

	}

//}

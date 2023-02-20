package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		try {
			num[3] = 2;
		} catch (Exception e) {
			System.out.println("에러 발생!");
		}
		System.out.println(num.length);
	}

}

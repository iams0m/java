package 배열복습;

import java.util.Random;

public class 랜덤최소값찾기 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10000];
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000) + 1; //1~1000
		}
		int min = s[0];
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println(min);
		String result = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] == min) {
				count++;
				result = result + i + " "; //result += i + " ";
			}
		}
		System.out.println("최소값인 " + min + "의 개수는 " + count + "개");
		System.out.println(result);
	}

}

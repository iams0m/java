package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0;
		int count2 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] < n2[i]) {
				count++;
				System.out.println("2학기 성적이 더 좋은 학생은 " + i);
			} else if (n1[i] > n2[i]) {
				count2++;
				System.out.println("1학기 성적이 더 좋은 학생은 " + i);
			}
		}
		
		System.out.println("2학기에 성적이 더 오른 학생은 " + count + "명 입니다.");
		System.out.println("1학기 성적이 더 좋았던 학생은 " + count2 + "명 입니다.");

	}

}

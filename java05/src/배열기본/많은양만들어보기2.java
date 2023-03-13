package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		
		Random r = new Random(42);

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(19) + 2; //2~20
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 15) {
				count++;
			}
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 15){
				sum = sum + jumsu[i];
		}
		
		}
		System.out.println("15이상 갯수 : " + count);
		System.out.println("15이상 총합 : " + sum);
	}

}

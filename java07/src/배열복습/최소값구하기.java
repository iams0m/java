package 배열복습;

public class 최소값구하기 {

	public static void main(String[] args) {
		int[] s = {90,80,20,60,70};
		int min = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i] < min) {
				min = s[i];
			}
		}
		System.out.println("최소값은 " + min);

	}

}

package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"치킨","피자","삼겹살"},
				{"떡볶이","불고기","갈비탕"},
				{"고구마","호떡","붕어빵"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}

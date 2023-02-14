package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "    010-245-1234    ";
		String s2 = s.trim();
		System.out.println(s2.length());
		
		//-를 기준으로 문자열을 3개로 분리
		String[] s3 = s2.split("-");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		if (s3[0].equals("011")) {
			System.out.println("SK");
		}else if (s3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	
	}

}

package 메서드연습;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result1 = cal2.add(300,  200);
		double result2 = cal2.add(300, 22.2);
		double result3 = cal2.add(11.1,  22.2);
		String result4 = cal2.add("나는 오늘 ", 1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}

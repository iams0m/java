package 스태틱;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길진", '여');
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("딸내미 " + 딸.count + "명");
		System.out.println("아빠 지갑에 " + 딸.money + "원 남아있음");

	}

}

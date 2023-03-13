package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer jack = new AppleComputer();
		BananaComputer jack2 = new BananaComputer();
		jack.검색하다();
		jack.로그인하다();
		jack.주문하다();
		jack2.검색하다();
		jack2.로그인하다();
		jack2.주문하다();

	}

}

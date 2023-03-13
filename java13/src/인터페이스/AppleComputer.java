package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 검색하다() {
		System.out.println("네이버로 검색하다.");

	}

	@Override
	public void 로그인하다() {
		System.out.println("네이버 로그인하다.");

	}

	@Override
	public void 주문하다() {
		System.out.println("네이버로 주문하다.");

	}

}

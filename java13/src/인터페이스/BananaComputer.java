package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 검색하다() {
		System.out.println("다음으로 검색하다.");

	}

	@Override
	public void 로그인하다() {
		System.out.println("다음 로그인하다.");

	}

	@Override
	public void 주문하다() {
		System.out.println("다음으로 주문하다.");

	}

}

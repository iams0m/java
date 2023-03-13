package 부품만들기;

public class 전화기 {
	//성질 : 멤버변수(가격, 모양)
	//public은 아무데서나(다른 패키지에서도) 접근 가능 설정(접근제어자)
	public int price; //멤버변수는 자동초기화! (0) int price = 0과 동일 굳이 0을 쓸필요 없음
	public String shape; //기본형이 아닌 경우(참조형) 모두 null로 초기화
	
	//동작 : 멤버메서드(함수와 동일), 동적인 기능 수행
	//     인터넷하다, 카톡하다.
	public void 인터넷하다() {
		System.out.println("와이파이를 이용하다.");
		System.out.println("전화기로 인터넷하다.");
	}
	public void 카톡하다() {
		System.out.println("자바 주말반 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
}

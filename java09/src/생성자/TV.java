package 생성자;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 때문에
	//클래스 전체 영역에서 이 변수를 사용할 수 있음.
	//전역변수(global변수, 글로벌 변수)
	//멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	
	//다른 생성자 메서드가 없으면 부품 만들 때(객체생성) 자동으로 생성됨
	//기본 생성자(default constructor)
//	public TV() {
//		System.out.println("TV객체 하나 생성됨");
//	}
	//객체 생성할 때마다 꼭 실행시키고 싶은 내용이 있다면
	
	//파라메터 있는 생성자
//	public TV(int ch, int vol, boolean onOff) { //매개변수(파라메터)
//		this.ch = ch;
//		this.vol = vol;
//		this.onOff = onOff;
//	}
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, local변수, 로컬변수, 자동초기화X
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	
	public void 유튜브보다() { //메서드를 만드는 것==> 메서드 정의한다.라고 표현.
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
	
	
}

package 부품만들기;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 때문에 클래스 전체 영역에서 이 변수를 사용할 수 있음
	//전역변수(global변수)
	//멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch;
	public int vol;
	public boolean onOff;
	
	public void 채널을바꾸다() { //붙여서 쓰기
		int change = 1; //지역변수, local변수, 자동초기화X
		System.out.println("채널을 " + ch + "번에서 " + change + "번으로 바꾸다.");
		
	}
	public void 유튜브보다() { //메서드를 만드는 것 => 메서드를 정의한다라고 표현!
		System.out.println("볼륨을 " + vol + "로 키워서 동영상을 보다.");
	}
}

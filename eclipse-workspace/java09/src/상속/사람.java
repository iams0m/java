package 상속;

public class 사람 extends Object {
	// 사람의 기본적인 성질 => 멤버변수
	String name;
	int age;
	char gender;

	// 사람의 동작 => 멤버메서드
	public void sleep() {
		System.out.println("잠자다");
	}

	public void eat() {
		System.out.println("먹다");
	}
}

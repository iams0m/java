package 상속;

public class 원더우먼 extends 우먼 {
	boolean fly;

	public void space() {
		sleep();
		System.out.println("성별은 " + gender);
		System.out.println("이름은 " + name);
		System.out.println("날라다니다.");
	}
}

package 상속;

public class 수퍼맨 extends 맨 {
	boolean fly;
	
	public void space() {
		sleep(); //사람
		System.out.println("이름은 " + name); //사람
		System.out.println("우주를 날다.");
	}
	
	//사람에 있는 걸 재정의
	@Override
	public void eat() {
		System.out.println("많이 먹다.");
	}
	
	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

}

package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		카운터스레드 count = new 카운터스레드();
		타이머스레드 timer = new 타이머스레드();
		
		count.start();
		timer.start();
	}

}

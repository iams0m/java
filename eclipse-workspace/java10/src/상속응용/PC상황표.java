package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		카운터스레드 count = new 카운터스레드();
		배열스레드 array = new 배열스레드();
		
		count.start();
		array.start();
	}

}

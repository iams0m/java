package 상속응용;

public class 달러골뱅이앤드스레드사용 {

	public static void main(String[] args) {
		스레드1 s1 = new 스레드1();
		스레드2 s2 = new 스레드2();
		스레드3 s3 = new 스레드3();
		
		s1.start();
		s2.start();
		s3.start();

	}

}

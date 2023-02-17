package 상속응용;

public class 카운터스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 60; i > 0; i--) {
			System.out.println("저녁먹기 " + i + "초전");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 생김");
			}
		}
	}
}

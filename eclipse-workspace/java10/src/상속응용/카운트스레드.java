package 상속응용;

public class 카운트스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			// CPU에게 스레드 쉬는시간 텀을 알려줍시다!
			// thread를 잠깐 재울 수 있음
			// CPU : 외부자원
			// 자바가 외부자원을 연결할 때에는 엄청 위험하다고 상황 인식
			// 만약 문제가 생기면 어떻게 할지 코드 작성
			try {
				Thread.sleep(1000); //2초 재워라
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}

		}
	}

}

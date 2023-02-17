package 상속응용;

public class 배열스레드 extends Thread {
	String[] s = { "이제", "곧", "저녁", "시간", "이다!" };

	@Override
	public void run() {
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
				try {
					Thread.sleep(1000); // 1초 재워라
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}

			}
		}

	}
}

package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		//1번부터 10번까지 데이터 중 짝수만 프린트
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				//break; //for문 종료, for문 아래에 있는 내용이 이어서 실행됨!
				System.exit(0); //프로그램 종료, 이후 내용 출력되지 않음
				//0 : 정상종료
				//0이 아닌 다른 값 : 비정상종료
			}
			
			if (i % 2 != 0) {
				continue; //이번 i만 for문 안의 내용을 실행하지 말아라!
			}
			System.out.println(i);
		}
		System.out.println("<for문 끝!>");
	}
}

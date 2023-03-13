package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 CPU가 접근하여 사용하고 싶은 경우 사용하는 부품
		// 1.값을 이미 알고 있는 경우
		int[] jumsu = { 10, 20, 30, 40 }; // length 만들어서 몇개인지 세서 값을 넣어줌
		// int jumsu[] 가능

		System.out.println(jumsu);
		System.out.println(jumsu[0]); // 첫번째 값
		System.out.println(jumsu[1]); // 두번째 값
		System.out.println(jumsu[2]); // 세번째 값
		System.out.println(jumsu[3]); // 네번째 값
		System.out.println("전체 개수 : " + jumsu.length + "개");

		jumsu[0] = 100;
		System.out.println(jumsu[0]); // 첫번째 값으로 100을 넣으세요. 10 -> 100
		System.out.println("");

		// 2.값을 아직 모르는데 먼저 저장 공간을 만들어두고 나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
		System.out.println("");

		// 문제1
		// 배열에 일주일간 공부한 시간을 저장해보세요.
		// {1,2,3,4,5,6,7}, 배열이름 - week
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(week[0]); // 첫번째 위치값 출력
		System.out.println(week[1]); // 두번째 위치값 출력
		System.out.println("전체 개수 : " + week.length + "개"); // week배열에 들어있는 데이터 수
		week[2] = 10; // 세번째 위치값을 10으로 변경
		week[4] = 12; // 다섯번째 위치값을 12로 변경
		System.out.println(week[2]); // 세번째 위치값 출력
		System.out.println(week[4]); // 다섯번째 위치값 출력
		System.out.println("");

		// 문제2
		// 값을 아직 모르는데 먼저 저장 공간을 만들어두고 나중에 값을 넣는 경우
		int[] tour = new int[4];
		tour[0] = 20; // 첫번째 인덱스에 20 넣기
		tour[2] = 30; // 세번째 인덱스에 30 넣기
		System.out.println(tour[0]); // 첫번째 위치값 출력
		System.out.println(tour[2]); // 세번째 위치값 출력
		System.out.println("전체 개수 : " + tour.length + "개"); // tour배열에 들어있는 데이터 수

	}
}

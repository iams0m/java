package 배열;

public class 확인문제 {

	public static void main(String[] args) {
		int[] n1 = new int[5];
		System.out.println("배열의 크기 : " + n1.length);
		
		n1[0] = 100; //첫번째 위치값에 100 넣기
		n1[4] = 500; //다섯번째 위치값에 500넣기
		System.out.println(n1[0]); //첫번째 위치값 출력
		System.out.println(n1[4]); //다섯번째 위치값 출력
		
		n1[2] = 200; //세번째 위치값에 200 넣기
		System.out.println(n1[2]); //세번째 위치값 출력
		
		for (int i = 0; i < n1.length; i++) {//배열 전체 데이터 출력
			System.out.print(n1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n1.length; i++) {//배열 전체 데이터 출력
			System.out.println((i + 1) + "번째 : " + n1[i] + " ");
		}
		
	}

}

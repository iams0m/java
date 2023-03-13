package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//1.배열 만들기 - 이미 값을 알고 있는 경우
//		String[] hobby = {"run", "book", "swim", "walk"};
		//hobby : 참조형변수, 주소가 들어있음
//		System.out.println(hobby);
//		System.out.println("0 : " + hobby[0]);
//		System.out.println("1 : " + hobby[1]);
//		System.out.println(hobby.length);
//		System.out.println(hobby[3]);
//		System.out.println(hobby[hobby.length-1]);
//		for (int i = 0; i < hobby.length; i++) {
//			System.out.println(i + " : " + hobby[i]);
//		}
//		
		//for-each문 :알아서처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내옴
		//출력용
//		for (String x : hobby) {
//			System.out.println(x);
//		}
		
		
		//2.배열 만들기 - 값을 모르고 있는 경우 공간부터 만들어두기
//		String[] jobs = new String[5];
//		System.out.println(jobs);
//		jobs[0] = "백엔드 프로그래머";
//		jobs[1] = "타코야끼 가게 주인";
//		System.out.println(jobs[0]);
//		System.out.println(jobs[1]);
//		System.out.println(jobs[4]);
//		System.out.println(jobs[jobs.length-1]);
//		System.out.println(jobs.length);
//		
//		for (String x : jobs) {
//			System.out.println(x);
//		}
		
		String[] travel = {"제주", "부산", "독일", "싱가포르", "스페인"};
		for (String x : travel) {
			System.out.println(x);
		}
		char[] color = {'r', 'p', 'b', 'g', 'b'};
		for (char c : color) {
			System.out.println(c);
		}
		
		double[] height = {178.7, 160, 188.2, 158.4, 172.5};
		for (double h : height) {
			System.out.println(h);
		}
		
	}

}

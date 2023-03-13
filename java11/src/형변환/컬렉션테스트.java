package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// Collection : 많은 양의 데이터를 다루는 부품류
		// ==> 종류가 많다.
		// ==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 Collection의 종류가 많음
		// ==> 배열 + 사이즈 조절 + 타입 아무거나 넣을 수 있는 ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(true);
		list.add(11.2);
		list.add('남');
		// toString()재정의 되어 있어서 가르키는 값들 프린트
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		// 중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		// 제거
		list.remove(0); // 파괴함수
		// 파괴함수 : 원본 파괴(원본 변형, ram에 있는 데이터 변경)
		// 비파괴함수 : 원본 파괴되지 않는 함수(ram에 있는 데이터 불변)
		System.out.println(list);
		// 변경
		list.set(0, "정길동"); // 파괴함수
		System.out.println(list);

		int index = list.indexOf(true); //true의 index값
		System.out.println(index); //2

		boolean result = list.contains(100); //list에 100이 있는가
		System.out.println(result); //true

		ArrayList list2 = new ArrayList();
		list2.add("박스키");
		list2.add("송스키");
		list2.add("김스키");
		list2.add("정스키");
		System.out.println(list2);

		list2.remove(1);
//		list2.set(1, "탈락");
		System.out.println(list2);

		for (int i = 0; i < list2.size(); i++) {
			System.out.println((i + 1) + "등 " + list2.get(i));

		}

		ArrayList list3 = new ArrayList();
		list3.add("이스키");
		list3.add("박스키");
		list3.add("양스키");
		list2.addAll(list3);
		System.out.println(list2);
		System.out.println(list3.isEmpty());
		System.out.println(list3);

	}
}

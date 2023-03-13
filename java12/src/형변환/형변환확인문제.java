package 형변환;

import java.awt.List;
import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000); //Object <- 업캐스팅 - Integer <- 오토박싱 - int
		list.add(189.1); //Object <- Double <- double
		list.add(true); //Object <- Boolean <- boolean
		list.add('남'); //Object <- Character <- char

		//ArrayList는 toString()재정의
		//list는  참조형이기 때문에  list를 프린트하면 주소가 프린트
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함
		//list를 찍어보면 주소대신 String으로 만든 내용 출력
		System.out.println(list);
		
		//int money = (int)list.get(0);
		int money = (Integer)list.get(0); //int <- 오토언박싱 - Integer <- 다운캐스팅 - Object
		System.out.println(money + 2000);

		double height = (double)list.get(1); //double <- Double <- Object
		System.out.println(height + 10);

		boolean food = (boolean)list.get(2); //boolean <- Boolean <- Object
		if (food) {
			System.out.println("그래도 배고파요.");
		} else {
			System.out.println("배고파요.");
		}
		char gender = (char)list.get(3); //char <- Character <- Object
		if (gender == '남') {
			System.out.println("주민번호는 1,3이예요.");
		}else {
			System.out.println("주민번호는 2,4예요.");
		}

	}

}
package 자바DB연결;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class 반환값연습 {
	// 부품은 기능을 처리하기 위해서 만든 부품.
	// 휴대폰의 기능 ==> 함수(메서드)
	public void add2() {
		System.out.println("더하기 기능을 수행합니다.");
	}

	public int add(int x, int y) {
		return x + y;
	}

	// 자바는 입력값이 다르면, 메서드 이름을 동일하게 사용할 수 있다.
	public double add(double x, int y) {
		return x + y; //자바에서는 하나라도 double이면 무조건 결과는 double!!
	}

	public String add(String x, String y) {
		return x + y;
	}

	public String add(int x, String y) {
		return x + y;
	}

	public int[] add() {// int로 만들어진 배열이므로 int[]
		int[] x = { 1, 2, 3 };
		return x;
	}

	public Date getDate() {
		Date date = new Date(); // import java.util.Date;
		return date; //년,월,일,시,분,초,요일
	}

	public Random getRandom() {
		Random r = new Random();
		return r;
	}

	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}

	public int getHour() {
		Date date = new Date();
		return date.getHours();
	}

	public ArrayList getList() {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add("고구마");
		return list;
	}

	public HashSet getSet() {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("펜");
		return bag;
	}

}

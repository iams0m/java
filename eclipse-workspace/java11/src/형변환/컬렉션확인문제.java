package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		HashSet place = new HashSet();
		place.add("제주도");
		place.add("싱가포르");
		place.add("스페인");
		place.add("영국");
		place.add("대만");
		System.out.println(place);

		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println("현관에는 무엇이 있나요? " + map.get("현관"));
		map.replace("거실", "책상");
		System.out.println(map);

		ArrayList list = new ArrayList();
		list.add("오전수업듣기");
		list.add("점심먹기");
		list.add("오후수업먹기");
		list.add("저녁먹기");
		list.add("복습하기");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "청소");
		System.out.println(list);
	}

}

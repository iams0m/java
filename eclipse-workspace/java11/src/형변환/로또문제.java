package 형변환;

import java.util.HashSet;

public class 로또문제 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("에어팟");
		bag.add("지갑");
		//toString 재정의
		System.out.println(bag);
		//중복X
		bag.add("지갑");
		System.out.println(bag);
	}

}

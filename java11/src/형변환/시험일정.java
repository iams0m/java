package 형변환;

import java.util.LinkedList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 시험일정 {

	public static void main(String[] args) {
		LinkedList 과목 = new LinkedList();
		과목.add("국어");
		과목.add("수학");
		과목.add("영어");
		과목.add("컴퓨터");
		System.out.println("전체 시험볼 과목 : " + 과목);
		for (int i = 0; i < 3; i++) {
			과목.remove();
			System.out.println((i + 1) + "일차 : 시험본 후 남은 과목 : " + 과목);
		}

	}

}

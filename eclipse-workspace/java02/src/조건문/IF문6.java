package 조건문;

import java.util.Date;

import javax.imageio.event.IIOReadWarningListener;

public class IF문6 {
	public static void main(String[] args) {
		//문제1
		Date date = new Date();
		int year = date.getYear() + 1900;

		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}

		//문제2
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("쉬자!");
			break;
		default:
			System.out.println("열심히 공부하자!");
			break;
		}
		
//		if (day == 0 || day == 6) {
//			System.out.println("쉬자!");
//		} else {
//			System.out.println("열심히 공부하자!");
//		}

		//문제3
		int month = date.getMonth() + 1;

//		if (month == 2) {
//			System.out.println("28일까지");
//		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
//			System.out.println("30일까지");
//		}else {
//			System.out.println("31일까지");
//		}

		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}
}

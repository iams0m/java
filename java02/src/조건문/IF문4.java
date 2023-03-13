package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		
		//Date - 년월일시분초, java.util.Date
		Date date = new Date();
		
		System.out.println(date.getHours()); //시
		System.out.println(date.getMinutes()); //분
		System.out.println(date.getSeconds()); //초
		
		System.out.println(date.getYear() + 1900); //년, 1900 더하기
		System.out.println(date.getDate()); //일
		System.out.println(date.getDay()); //요일, 일요일(0)부터 시작
		int hour = date.getHours();
		
		//int hour = 15;
		
		if (hour < 11) {
			System.out.println("Good Morning!");
		}else if (hour < 14) {
			System.out.println("Good Afternoon!");
		}else if (hour < 20) {
			System.out.println("Good Evening!");
		}else {
			System.out.println("Good Night!");
		}
		
		
		int month = date.getMonth() + 1; //0~11로 표현
		System.out.println(month);
		//int month = 2;
		switch (month) {
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}

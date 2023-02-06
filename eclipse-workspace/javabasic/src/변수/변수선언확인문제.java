package 변수;

import java.util.jar.Attributes.Name;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 26; //정수
		double height = 162.5; //실수
		char gender = '여'; //글자1글자
		boolean food = false; //논리값
		
		//기본데이터X ==> 너무 많이 사용하기 때문에 기본형데이터처럼 사용 가능
		String name = "홍길동"; //여러글자를 쓸 때는 ""
		
		System.out.println("나이는 " + age + "세입니다.");
		System.out.println("키는 " + height + "cm입니다.");
		System.out.println("성별은 " + gender + "자입니다.");
		System.out.println("아침은 " + food);
		System.out.println("이름은 " + name + "입니다.");

	}

}

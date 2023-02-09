package 조건문;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class 콘솔입력1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자바프로그램과 콘솔 간에 통로를 만든다.
		//연결통로 == Stream
		//Stream은 내가 닫아주지 않으면 계속 가지고 있게 됌.
		//Stream은 반드시 닫아주자!
		System.out.print("요일 입력 : 주중1) 주말2)");
		int data = sc.nextInt(); //String --> int
		if (data == 1) {
			System.out.println("열심히 공부합시다!");
		}else {
			System.out.println("열심히 놉시다!");
		}
		
		System.out.print("주말에 뭐하지?");
		String data2 = sc.next();
		System.out.println("나는 주말에 " + data2 + "를 할 거야");
		
		sc.close();
		
	}

}

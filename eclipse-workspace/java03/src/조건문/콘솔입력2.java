package 조건문;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class 콘솔입력2 {

	public static void main(String[] args) {
		System.out.println("나에 대한 정보");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String data1 = sc.next();
		
		System.out.print("나이 입력 >> ");
		String data2 = sc.next();
		
		System.out.print("취미 입력 >> ");
		String data3 = sc.next();
		
		
		System.out.println("나의 이름은 " + data1);
		System.out.println("나의 나이는 " + data2 + "세");
		System.out.println("나의 취미는 " + data3 + "입니다");
		
		sc.close();
		
	}

}

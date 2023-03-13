package 조건문;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >>");
		int data1 = sc.nextInt();
		System.out.println("내년 나이는 " + (data1 + 1) + "세");
		
		System.out.print("키를 입력 >>");
		Double data2 = sc.nextDouble();
		System.out.println("당신의 키는 " + data2);
		
		System.out.print("저녁을 드셨나요?(true/false) ");
		Boolean data3 = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 " + data3);
		
		System.out.print("올해의 목표는 >>");
		sc.nextLine();
		String data4 = sc.nextLine();
		System.out.println("올해의 목표는 " + data4);
		
		sc.close();
		
	}

}

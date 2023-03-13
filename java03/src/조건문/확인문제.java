package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class 확인문제 {

	public static void main(String[] args) {
		//문제1
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("id >>");
//		String data1 = sc.next();
//		
//		System.out.print("pw >>");
//		int data2 = sc.nextInt();
//		
//		if (data1.equals("root") && data2 == 1234) {
//			System.out.println("로그인 성공!");
//		}else {
//			System.out.println("로그인 실패!");
//		}
		
		//문제2
		System.out.print("사과 구매 갯수는?");
		int data3 = sc.nextInt();
		
		System.out.print("사과 한 개당 가격은?");
		int data4 = sc.nextInt();
		
		System.out.print("딸기 구매 갯수는?");
		int data5 = sc.nextInt();
		
		System.out.print("딸기 한 개당 가격은?");
		int data6 = sc.nextInt();
		
		int total1 = data3 * data4;
		int total2 = data5 * data6;
		
		System.out.println("사과 구매 가격은 " + total1 + "입니다.");
		System.out.println("딸기 구매 가격은 " + total2 + "입니다.");
		System.out.println("전체 구매 가격은 " + (total1 + total2) + "입니다.");
		
		//문제3
//		System.out.print("시작값 : ");
//		int start = sc.nextInt();
//		
//		System.out.print("종료값 : ");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("최종 더한 값은 " + sum);
		
		//문제4
//		System.out.print("시작값 : ");
//		int start = sc.nextInt();
//		
//		System.out.print("종료값 : ");
//		int end = sc.nextInt();
//		
//		System.out.print("점프값 : ");
//		int jump = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <=end; i = i + jump) {
//			sum = sum + i;
//			if (sum>=100) {
//				System.exit(0);
//			}
//		}
//		
//		System.out.println("최종 더한 값은 " + sum);
		
		sc.close();
		
	}

}

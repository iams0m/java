package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
		//문제1
		Scanner sc = new Scanner(System.in);
//		System.out.print("id입력>> ");
//		
//		String id = sc.next();
//		System.out.print("pw입력>> ");
//		
//		String pw = sc.next();
//
//		if (id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		//문제2
//		System.out.println("사과 구매 갯수>> ");
//		int aCount = sc.nextInt();
//		
//		System.out.println("사과 한 개 가격>> ");
//		int aPrice = sc.nextInt();
//		
//		System.out.println("딸기 구매 갯수>> ");
//		int bCount = sc.nextInt();
//		
//		System.out.println("딸기 한 개 가격>> ");
//		int bPrice = sc.nextInt();
//		
//		int aTotal = aCount * aPrice;
//		int bTotal = bCount * bPrice;
//		int Total = aTotal + bTotal;
//		
//		System.out.println("사과 구매 금액은 " + aTotal + "원");
//		System.out.println("딸기 구매 금액은 " + bTotal + "원");
//		System.out.println("전체 구매 금액은 " + Total + "원");
		
		//문제3
//		System.out.println("시작값>> ");
//		int start = sc.nextInt();
//		
//		System.out.println("종료값>> ");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("총 더한 값은 " + sum);
		
		//문제4
		System.out.println("시작값>> ");
		int start = sc.nextInt();
		
		System.out.println("종료값>> ");
		int end = sc.nextInt();
		
		System.out.println("점프값>> ");
		int jump = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i = i + jump) {
			sum = sum + i;
			if (sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println("총 더한 값은 " + sum);
		
		sc.close();
	}

}

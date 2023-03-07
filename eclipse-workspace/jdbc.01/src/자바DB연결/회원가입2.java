package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //콘솔에서 키보드로 입력할 수 있는 Scanner. 괄호 안에 무조건 작성해주어야 함(어디서 입력해야할지를 작성).
		System.out.println("id/pw/name/tel순으로 입력하세요.");
		String id = sc.next(); 
		String pw = sc.next(); 
		String name = sc.next();
		String tel = sc.next();

		MemberDAO2 dao = new MemberDAO2();
		dao.insert(id, pw, name, tel);
	}

}

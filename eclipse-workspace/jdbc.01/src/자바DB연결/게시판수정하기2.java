package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no/title/content순으로 입력하세요.");
		
		int no = sc.nextInt(); //"10" -> 10
		String title = sc.next();
		String content = sc.next();

		Bbs2DAO dao = new Bbs2DAO();
		dao.update(no, title, content);
	}

}

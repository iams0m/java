package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no/title/content/writer순으로 입력하세요.");
		String no = sc.next(); 
		String title = sc.next(); 
		String content = sc.next();
		String writer = sc.next();

		Bbs2DAO dao = new Bbs2DAO();
		dao.insert(no, title, content, writer);
	}

}

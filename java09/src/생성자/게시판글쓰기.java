package 생성자;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		Bbs bbs1 = new Bbs(1, "java", "fun java", "park");
		System.out.println(bbs1);
		Bbs bbs2 = new Bbs(2, "jsp", "fun jsp", "hong");
		System.out.println(bbs2);
		Bbs bbs3 = new Bbs(3, "spring", "fun spring", "kim");
		System.out.println(bbs3);

	}

}

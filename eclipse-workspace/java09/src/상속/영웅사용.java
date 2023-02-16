package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
//		사람 p = new 사람();
//		p.name = "홍길동";
//		p.age = 100;
//		System.out.println(p);
//		p.eat();
//		
//		맨 m = new 맨();
//		m.run();
//		
//		수퍼맨 s = new 수퍼맨();
//		s.name = "클라크";
//		s.age = 25000;
//		s.power = 30000;
//		s.fly = true;
//		s.eat();
//		s.run();
//		s.space();

		원더우먼 w = new 원더우먼();
		w.gender = '여'; // 사람
		w.name = "모름"; // 사람
		w.fly = true; // 원더우먼
		w.eat(); // 사람
		w.run(); // 우먼
		w.space(); // 원더우먼

	}

}

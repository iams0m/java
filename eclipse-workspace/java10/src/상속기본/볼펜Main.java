package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 b = new 볼펜();
		b.bold = 10;
		b.price = 1000;
		b.company = "동아";
		System.out.println(b);
		
		b.write();
		b.buy();
	}
}

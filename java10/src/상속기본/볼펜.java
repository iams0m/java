package 상속기본;

public class 볼펜 extends 학용품 {
	int bold;
	public void write() {
		System.out.println("글을 쓰다.");
	}
	@Override
	public String toString() {
		return "볼펜 [bold=" + bold + ", price=" + price + ", company=" + company + "]";
	}
}

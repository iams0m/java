package 메서드연습;

public class 계산기2 {
	//메서드 이름: 입력값이 다르면 다 동일하게 써도 됌
	//하나의 이름으로 다양한 형태 구현 가능 => 다형성(오버로딩)
	
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, Double y) {
		return x + y;
	}
	public double add(Double x, Double y) {
		return x + y;
	}
	public String add(String x, int y) {
		return x + y + "시에 점심을 먹을거야";
	}
}

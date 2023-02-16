package 스태틱;

public class 일기 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "대방동");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("산책하기", 1, "가음정");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("시험요약정리", 2, "강의실");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//총12개 다이나믹 생성, 멤버변수 => 객체 생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		//인스턴스 변수
		
		//static이 붙은 메서드나 변수는 객체생성하지 않아도 클래스이름으로 바로 접근해서 사용 가능
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}

package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77;
		int me = 88;
		
		if (target == me) {
			System.out.println("정답입니다!");
		}else {
			System.out.println("오답입니다!");
		}
		
		//String target2 = "로또";
		String you = "모닝 피파는 좀";
		switch (you) {
		case "로또":
			System.out.println("정답입니다!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답입니다!");
			break;
		default: //위의 조건이 다 아닐 때 실행하고 싶은 내용 작성, 생략 가능
			System.out.println("그만해!");
			break;
		}

	}

}

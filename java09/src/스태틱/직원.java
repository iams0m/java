package 스태틱;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class 직원 {
String 이름;
	int 나이;
	String 성별;
	static int count;
	static int sum;

	public static void getAvg() {
		//static메서드에서 전역변수에 접근할 때는 같은 성격을 가진 static변수만 접근 가능!
		//System.out.println(이름);
	}

	public 직원(String 이름, int 나이, String 성별) {
		count++;
		sum = sum + 나이;
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
	}

	@Override
	public String toString() {
		return "회사창업 [이름=" + 이름 + ", 나이=" + 나이 + ", 성별=" + 성별 + "]";
	}

}

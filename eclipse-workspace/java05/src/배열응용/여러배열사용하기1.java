package 배열응용;

public class 여러배열사용하기1 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우 같은 인덱스 사용하기
		// 예) 아버지에 대한 정보는 모든 배열에서 0번에 넣자!
		String[] 식구 = { "아버지", "어머니", "오빠", "나" };
		int[] age = { 100, 50, 30, 25 };
		double[] height = { 175.5, 160.5, 180.5, 163.5 };
		System.out.println("이름\t나이\t키");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]); 	
		}

	}

}

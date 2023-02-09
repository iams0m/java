package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; //length : 10
		//index는 0부터 시작 => 마지막 위치의 인덱스는 9
		//0~9
		System.out.println("전체 개수 : " + x.length + "개");	
		x[0] = 10;
		x[1] = 20;
			System.out.println(x[0]);
			System.out.println(x[1]);
			System.out.println(x[2]);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		//문제1
		//가족의 성별을 char[]로 저장, 프린트
		//가족의 이름을 String[]로 저장, 프린트
		//가족의 시력을 String[]로 저장, 프린트
		//가족의 점심여부를 Boolean[]로 저장, 프린트
		
		char[] gender = {'남','남','여'};
		System.out.println("<성별>");
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		String[] name = {"주지훈", "주진모", "주현영"};
		System.out.println("<이름>");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		double[] eyes = {0.3, 0.2, 1.0};
		System.out.println("<시력>");
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");
		}
		
	}

}

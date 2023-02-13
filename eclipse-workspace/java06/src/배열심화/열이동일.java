package 배열심화;

public class 열이동일 {

	public static void main(String[] args) {
		int[][] n2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2.length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행의 개수 : " + n1.length);
		System.out.println("0행 배열의 행의 개수 : " + n1[0].length);
		System.out.println("1행 배열의 행의 개수 : " + n1[1].length);
		System.out.println("2행 배열의 행의 개수 : " + n1[2].length);

		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

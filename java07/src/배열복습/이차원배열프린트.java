package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		//배열을 만들 때 이미 알고 있는 경우
		int[][] n1 = {
			   //0 1 2
				{1,2,3},//0
				{4,5,6} //1
		};
		System.out.println(n1.length); //2차원 배열의 length(행)
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) { //행
			for (int j = 0; j < n1[i].length; j++) { //열
				System.out.println(n1[i][j]);
			}
		}
		
		
		//배열을 만들 때 아직 모르고 있는 경우 공간 먼저 만들기
		int[][] n2 = new int[2][3]; 
	}

}

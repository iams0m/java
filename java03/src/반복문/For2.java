package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for ( ; ;) { //무한 루프(반복), while(true)
			System.out.println("잘 안씀!");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			//==연산자는 기본데이터만 비교 가능
			//String부품에서 제공하는 기능을 사용해서 비교해주기
			if (data.equals("y")) { //true이면
				System.out.println("안녕히가세요!");
				break; //for문의 break
			}
		}

	}

}

package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2(); //void
		//int result = re.add2(); 반환값이 없어서 오류(void) 
		
		int result1 = re.add(200, 100); //int 300
		System.out.println("더한 값은 " + result1);
		
		//String data = JOptionPane.showInputDialog("입력");
		//String data2 = JOptionPane.showMessageDialog(null, "출력값"); 반환값이 없어서 오류(void)
		
		double result2 = re.add(22.1, 10);
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("나는", "천재");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "번 천재");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); //{1,2,3}
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getDate(); //import 해주지 않으면 java.util.Date 앞에 쓰고 시작해야함
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay()); //요일 : 0(일), 1(월), 2(화) ...
		//==> 리턴이 없는 값은 프린트 불가
		//==> result6.getMinutes()는 리턴이 있어서 프린트 가능!
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다. 수업중.");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0) + " " + result9.get(1));
		result9.set(0, "양파");
		System.out.println(result9);
		
		HashSet result10 = re.getSet();
		System.out.println(result10);

	}

}

package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String week = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String after = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + week + "에 수업 후 나는 " + after + "할 예정";
		
		System.out.println(result);
				
				
	}

}

package 순차문;

import javax.naming.spi.ResolveResult;
import javax.naming.spi.DirStateFactory.Result;
//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("키를 입력하세요.");
		String data2 = JOptionPane.showInputDialog("체중을 입력하세요.");
		
		double data11 = Double.parseDouble(data1);
		double data22 = Double.parseDouble(data2);
		
		double result = data22 / (data11*data11);
		
		System.out.println("BMI는 " + result + "입니다.");
		
		JOptionPane.showMessageDialog(null, result);
	}

}

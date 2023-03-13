package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,200);
		String header[] = {"컴퓨터", "영어", "수학", "체육"};
		Integer contents[][] = {
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}, 
				{100, 88, 99, 77}	
		};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		
		f.add(scroll);

		f.setVisible(true);
	}
}

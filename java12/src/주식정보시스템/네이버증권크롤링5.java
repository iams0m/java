package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링5 {

	public void naver(String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);

		Document doc = null; // 로컬변수 초기화! 수동으로
		try {
			doc = con.get(); // html코드 다 가져오기
			Elements codeList = doc.select(".code"); // <a class="nav">
//			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
//			System.out.println("코드는 " + code);

//			Elements todayList = doc.select(".today .blind");
			Elements todayList = doc.select("span.blind");
//			System.out.println(todayList.size());
//			System.out.println(todayList);
//			for (int i = 0; i < todayList.size(); i++) {
//				System.out.println(i + " : " + todayList.get(i));
//			}
			System.out.println(todayList.get(12));
			Element tag2 = todayList.get(12);
			String today = tag2.text();
			System.out.println("거래가 : " + today);

			System.out.println(todayList.get(16));
			Element tag3 = todayList.get(16);
			String high = tag3.text();
			System.out.println("최고가 : " + high);

			System.out.println(todayList.get(20));
			Element tag4 = todayList.get(20);
			String low = tag4.text();
			System.out.println("최저가 : " + low);
			
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2 + "\n");
			file.write(today + "\n");
			file.write(high + "\n");
			file.write(low + "\n");
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		} // html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}

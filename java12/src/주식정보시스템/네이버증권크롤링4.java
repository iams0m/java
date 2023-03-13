package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=051910");

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); // html코드 다 가져오기
			Elements codeList = doc.select(".code"); // <a class="nav">
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
//			Elements todayList = doc.select(".today .blind");
			Elements todayList = doc.select("span.blind");
			System.out.println(todayList.size());
//			System.out.println(todayList);
//			for (int i = 0; i < todayList.size(); i++) {
//				System.out.println(i + " : " + todayList.get(i));
//			}
			//거래가
			System.out.println(todayList.get(12));
			Element tag2 = todayList.get(12);
			String today = tag2.text();
			System.out.println("거래가 : " + today);
			//최고가
			System.out.println(todayList.get(16));
			Element tag3 = todayList.get(16);
			String high = tag3.text();
			System.out.println("최고가 : " + high);
			//최저가
			System.out.println(todayList.get(20));
			Element tag4 = todayList.get(20);
			String low = tag4.text();
			System.out.println("최저가 : " + low);
			
			//전일, 시가
			Elements list = doc.select(".first .blind");
//			System.out.println(list.size());
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(i + " : " + list.get(i));
//			}
			System.out.println(list.get(0));
			Element tag5 = list.get(0);
			String price1 = tag5.text();
			System.out.println("전일 : " + price1);
			
			System.out.println(list.get(1));
			Element tag6 = list.get(1);
			String price2 = tag6.text();
			System.out.println("시가 : " + price2);
			

		} catch (IOException e) {
			e.printStackTrace();
		} // html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}

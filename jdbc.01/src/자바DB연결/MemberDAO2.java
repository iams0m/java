package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.spi.DirStateFactory.Result;

public class MemberDAO2 {

	public int delete(String id) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);

			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!

			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원탈퇴 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int update(String id, String tel) { // 첫번째 값이 id, 두번째 값이 tel
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);

			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!

			String sql = "update hr.MEMBER set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result >= 1) {
				System.out.println("회원수정 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int insert(String id, String pw, String name, String tel) {
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);

			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			ps.setString(1, id); // ps.setInt(1,no);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);

			// ==> insert into hr.MEMBER values ('a', 'a', 'a', 'a');

			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안 된 경우, 위험한 상황이라고 판단하여 catch 실행
			// result = 0;
			// System.out.println(result);
			e.printStackTrace(); // 에러를 추적해서 프린트
		}
		System.out.println(result);
		return result;
	}

}

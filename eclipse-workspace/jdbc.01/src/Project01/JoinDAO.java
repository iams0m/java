package Project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import 화면DB연결.MemberVO;

public class JoinDAO {

	public int delete(JoinVO bag) {
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

			String sql = "delete from hr.MP_CUS where id = ? && pw = ? && name = ? && birth = ? && tel = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getBirth());
			ps.setString(5, bag.getTel());
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원탈퇴가 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//delete

	public int update(JoinVO bag) {
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

			String sql = "update hr.MP_CUS set pw = ?, tel = ? where id = ? and name = ? and birth = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getTel());
			ps.setString(3, bag.getId());
			ps.setString(4, bag.getName());
			ps.setString(3, bag.getBirth());
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원정보 수정이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//update

	public int insert(JoinVO bag) {
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

			String sql = "insert into hr.MP_CUS values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getBirth());
			ps.setString(5, bag.getTel());

			System.out.println("3.sql문 생성 성공.");

			result = ps.executeUpdate(); // 잘 인식하면 1
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			
			if (result == 1) {
				System.out.println("회원가입이 완료되었습니다.");
			}
		} catch (Exception e) {
			// insert가 제대로 안 된 경우, 위험한 상황이라고 판단하여 catch 실행
			// result = 0;
			// System.out.println(result);
			e.printStackTrace(); // 에러를 추적해서 프린트
		}
		System.out.println(result);
		return result;
	}//insert
	
	public int login(JoinVO bag) {
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

			String sql = "select * from hr.MP_CUS where pw = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			System.out.println("3.sql문 생성 성공.");
			System.out.println("4.sql문 서버로 전송 성공 반영된 row수 >> " + result);
			
			ResultSet rs = ps.executeQuery(); // select문 전송시
			if (rs.next()) {// 검색결과가 있는지 여부 ==> rs.next()
				// true => 있다, false => 없다
				System.out.println("회원정보를 수정합니다.");
				result = 1;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			ps.close();con.close();rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//login

}

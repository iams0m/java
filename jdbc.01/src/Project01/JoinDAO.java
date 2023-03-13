package Project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import 화면DB연결.MemberVO;

public class JoinDAO {

	public ArrayList<JoinVO> list() {
		ResultSet rs = null;
		
		ArrayList<JoinVO> list = new ArrayList<>();
		
		JoinVO bag = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from hr.MP_CUS";
			PreparedStatement ps = con.prepareStatement(sql);

			rs = ps.executeQuery();//select문 전송시
			while (rs.next()) {//검색 결과가 있는지 여부는 rs.next()
				//true => 있다. false => 없다.
				//1.검색결과가 있으면, 각 컬럼에서 값들을 꺼내오자
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String birth = rs.getString(4);
				String tel = rs.getString(5);
				//2.가방을 만들자
				bag = new JoinVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				//3.list에 bag을 추가하자.
				list.add(bag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//end list
	
	public int delete(JoinVO bag) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "delete from hr.MP_CUS where id = ? and pw = ? and name = ? and birth = ? and tel = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getBirth());
			ps.setString(5, bag.getTel());

			result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원탈퇴가 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//end delete

	public int update(JoinVO bag) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);//DB연결

			String sql = "update hr.MP_CUS set pw = ?, tel = ? where id = ? ";//SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getTel());
			ps.setString(3, bag.getId());

			result = ps.executeUpdate();

			if (result == 1) {
				System.out.println("회원정보 수정이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//end update

	public int insert(JoinVO bag) {
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);//DB연결

			String sql = "insert into hr.MP_CUS values (?, ?, ?, ?, ?)";//SQL문 생성
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getBirth());
			ps.setString(5, bag.getTel());

			result = ps.executeUpdate();//DB 반영
			
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
	}//end insert
	
	public int login(JoinVO bag) {
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "select * from hr.MP_CUS where pw = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			
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
	}//end login

}

package Project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class MemberDAO {

	public ArrayList<Project01.MemberVO> list() {
		ResultSet rs = null;
		
		ArrayList<Project01.MemberVO> list = new ArrayList<>();
		
		Project01.MemberVO bag = null;

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
				bag = new Project01.MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
				//3.list에 bag을 추가하자.
				list.add(bag);
			}
		} catch (Exception e) {
			e.printStackTrace(); // 에러를 추적해서 프린트
		}
		return list;
	}//end list
	
	public int insert(Project01.MemberVO bag) {// 등록
		int result = 0;//결과를 담기 위한 변수 선언

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into hr.MP_CUS values (?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getBirth());
			ps.setString(5, bag.getTel());
			//SQL문을 오라클로 보내면, 오라클이 결과를 알려줌
			result = ps.executeUpdate();

			if (result == 1) {
				System.out.println("고객등록이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		//오라클이 보내준 결과를 UI로 넘기자.
		return result;
	}//end insert
	
	public Project01.MemberVO search(String id) {// 검색
		ResultSet rs = null;// 항목명 + 결과 데이터를 담고 있는 테이블
		Project01.MemberVO bag = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			
			Connection con = DriverManager.getConnection(url, user, password);//DB연결

			String sql = "select * from hr.MP_CUS where ID = ?";//SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			rs = ps.executeQuery();//검색을 위한 데이터 패킷 만들기
			if (rs.next()) {// 검색 결과가 있으면,
				System.out.println("검색 결과가 있습니다.");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String birth = rs.getString(4);
				String tel = rs.getString(5);
				System.out.println(id2 + " " + pw + " " + name + " " + birth + " " + tel);
				bag = new Project01.MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setBirth(birth);
				bag.setTel(tel);
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}//end search

	public int update(Project01.MemberVO bag) {// 수정
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);//DB연결

			String sql = "update hr.MP_CUS set pw = ?, tel = ? where id = ? "; //SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getTel());
			ps.setString(3, bag.getId());

			result = ps.executeUpdate();//DB에 반영
			if (result == 1) {
				System.out.println("회원정보 수정이 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//end update
	
	public int delete(String id) {// 삭제
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 연결

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);//DB연결

			String sql = "delete from hr.MP_CUS where id = ?";//SQL문 생성
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			result = ps.executeUpdate();//DB에 반영
			if (result == 1) {
				System.out.println("회원 정보 삭제 완료.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}//end delete
}

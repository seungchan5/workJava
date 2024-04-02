package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEX {
	
	public static void main(String[] args) {
		JDBCEX ex = new JDBCEX();
		ex.getList();
		//ex.insert();
		//ex.delete();
		//ex.update();
	}
	
	public void getList() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn;
		
		try {
			// 클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 커넥션 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			
			// 쿼리 실행객체 생성하기
			Statement stmt = conn.createStatement();
			
			// 쿼리 실행 후 결과집합 받아오기
			ResultSet rs = stmt.executeQuery("select * from book order by no"); // order by 컬럼명 = 컬럼에 해당하는 순서대로 정렬
			List<Book> list = new ArrayList<>();
			
			while (rs.next()) {
			int no =  rs.getInt(1);
			String title =  rs.getString(2);
			String author = rs.getString(3);
			String isRent =  rs.getString(4);
			Date regDate = rs.getDate(5);
			Date editDate = rs.getDate(6);
			Book book = new Book(no, title, author, isRent, regDate, editDate);
			list.add(book);
			}
			
			System.out.println(list);
			for(Book book : list) {
				System.out.println(book.toString());
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void connection() {
		// 데이터 베이스 접근시 필요한 정보
		// ip, port, sid, 계정정보, 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn;
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 얻기 성공 " + conn);
			// 쿼리 실행
			Statement stmt = conn.createStatement();
			
			// 데이터 조회
			// stmt.executeQuery(쿼리문장 포함);
			// ResultSet : 결과집합
			ResultSet rs = stmt.executeQuery("select count (*) from book");
			rs.next();
			System.out.println("조회결과 : " + rs.getInt("count(*)"));
			
			// 자원 반납
			rs.close();
			stmt.close();
			conn.close();
			
			// 데이터 생성, 수정, 삭제
			// stmt.executeUpdate("");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		Connection conn;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			
			// 몇건이 처리되었는지 반환해준다.
			int res = stmt.executeUpdate("insert into book values (10, '오라클을 다루는 기술', '박찬미', 'N', sysdate, null)");
			
			System.out.println(res + "건 처리되었습니다.");
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void delete() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("오토커밋 - false 설정");
			conn.setAutoCommit(false);
			// 쿼리 실행 준비
			Statement stmt = conn.createStatement();
			// 몇건이 처리 되었는지 반환
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res + "건 처리 되었습니다.");
			conn.rollback();
			System.out.println("롤백 되었습니다.");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		// 데이터 베이스 접근시 필요한 정보
		// ip, port, sid, 계정정보, 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB연결 설정
			Connection conn = DriverManager.getConnection(url, id, pw);
			// 쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			// 쿼리 실행
			int res = stmt.executeUpdate("update book set isRent ='Y' where no=2");
			// 결과 출력
			System.out.println(res + "건 처리되었습니다.");
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

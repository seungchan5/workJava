package getconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_ex {
	public static void main(String[] args) {
		System.out.println("conn생성");
		getConnection();
	}
	public static Connection getConnection() {
		Connection conn = null;
		
		// DB접근하기 위해 필요한 정보
		// ip:port:sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jungang";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn);
			
			Statement stmt = conn.createStatement();
			// xxxx-xx-xx
			ResultSet rs = stmt.executeQuery("SELECT TO_CHAR(SYSDATE,'YYYY-MM-DD') FROM DUAL");
			if(rs.next()) {
				String today = rs.getString(1);
				System.out.println("오늘날짜 : " + today);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 로딩 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}
}

package Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex04 {
	public static void main(String[] args) {
		Ex04.getConnection();

	}
	
	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id ="orauser";
		String pw ="1234"; 
		
		String sql = "select sysdate from dual";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			String sys = rs.getString(1);
			System.out.println(sys);
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

}

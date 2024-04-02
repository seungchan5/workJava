package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.common.ConnectionUtil;

/**
 * DB에 연결해서 데이터 입출력 처리
 * @author user
 *
 */
public class RentDao {
	
//	public static void main(String[] args) {
//		RentDao dao = new RentDao();
		// 입력테스트
//		System.out.println(dao.insert("user", 3));
		// 대여여부 테스트
//		System.out.println(dao.getrentYN(3));
		// 반납테스트
//		System.out.println(dao.update(3));
//	}
	/**
	 * 도서의 대출 상태를 확인
	 * @param no
	 * @return 대출중 : Y
	 * 			대출가능 : N
	 */
	public String getrentYN(int no) {
		
		String sql =String.format("SELECT 대여여부 FROM 대여 WHERE 도서번호 = ? and 대여여부 = 'Y'", no) ;
		String rentYN = "N";
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			// 파라메터 세팅 : ?에 순서대로	
			pstmt.setInt(1, no);
			// 쿼리실행
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rentYN = rs.getString(1);
			}
			
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rentYN;
		
	}
	
	public int insert(String id, int no) {
		int res = 0;
		String sql =String.format("INSERT INTO 대여 VALUES (SEQ_대여.NEXTVAL, ?,?,'Y', SYSDATE, NULL, SYSDATE+7, NULL)", id,no) ;
		
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, id);
			pstmt.setInt(2, no);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	public int update(int no) {
		int res = 0;
		String sql = "update 대여 set 반납일 = sysdate, 대여여부 ='N' WHERE 도서번호 = ?" ;
		
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
	}
}

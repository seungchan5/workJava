package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	/**
	 * 도서목록 조회
	 * @return
	 */
	public List<Book> getList() {
		List<Book> list = new ArrayList<Book>();
		//String sql = "SELECT * FROM BOOK order by no";
		String sql = 
				"SELECT NO, TITLE "
				+ "    ,NVL((SELECT 대여여부 "
				+ "			FROM 대여 "
				+ "			WHERE 도서번호 = NO "
				+ "			AND 대여여부 = 'Y'),'N') RENTYN"
				+ "    ,AUTHOR "
				+ "FROM BOOK "
				+ "ORDER BY NO";
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
				// stmt.executeUpdate : int (몇건이 처리되었는지)
				ResultSet rs = stmt.executeQuery(sql)) {
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				// list.add(new book(no, title, rentYN, author))
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	/**
	 *  도서 등록
	 * @param book
	 * @return
	 */
	public int insert(Book book) {
		int res = 0;
		String sql = String.format("insert into book values (SEQ_BOOK_NO.NEXTVAL,'%s','%s','%s')", book.getTitle(),book.getRentYN(),book.getAuthor());
		// 실행될 쿼리를 출력
		//System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 도서 삭제
	 * @param book
	 * @return
	 */
	public int delete(int no) {
		int res = 0;
		String sql = String.format("DELETE from BOOK WHERE NO = %s", no);
		//System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	public int update(int no, String rentYN) {
		int res = 0;
		String sql = String.format("update book set rentYN = '%s' where no = %d", rentYN, no);
		//System.out.println(sql);
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	public String getRentYN(int no) {
		String rentYN = "";
		String sql = String.format("select rentYN from book where no = %s", no);
		
		
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			// 조회된 행이 있는지 확인
			if(rs.next()) {
				// DB에서 조회된 값을 변수에 저장
				rentYN = rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rentYN;
	}
	
}

package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				// Y,N
				String isRentStr = rs.getString("isRent");
				// (조건)? 참일때 반환값 : 거짓일때 반환값
				boolean isRent = ("Y".equals(isRentStr))?true:false;
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
			
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int no) {
		try {
			Connection conn =  DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete book where no = " + no);
			System.out.println(res + "건 처리되었습니다.");
			
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(int no) {
		int res=0;
		try {
			Connection conn =  DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate("update book set isRent ='Y' where no= " + no);
			System.out.println(res+ "건 처리되었습니다");
			
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert(Book book) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

}

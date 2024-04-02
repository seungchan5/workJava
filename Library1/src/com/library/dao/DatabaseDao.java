package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getBookList() {
		System.out.println("DB - 리스트조회");
		return null;
	}

	@Override
	public int insertBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}

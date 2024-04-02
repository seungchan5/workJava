package com.library.dao;

import java.util.List;
import com.library.vo.Book;

public interface Dao {
	
	// 책 리스트를 조회
	List<Book> getBookList();
	
	// 신규 도서 등록
	int insertBook(List<Book> list);
	
	// 도서 삭제
	int deleteBook(List<Book> list);
	
	// 도서 정보 업데이트
	int updateBook(List<Book> list);
	
}

package com.library.dao;

import java.util.List;

import com.library.vo.Book;
// Dao 역할 : 파일로부터 리스트 조회, 파일로부터 리스트 출력
public interface Dao {
	// 파일을 읽어서 리스트를 반환합니다.
	List<Book> getList();
	int delete(int no);
	int update(int no);
	int insert(Book book);
	
	// 리스트를 파일로 출력합니다.
	boolean listToFile(List<Book> list);

}

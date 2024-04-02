package com.library;

import java.util.List;

import com.library.controller.LibraryController;
import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {

	public static void main(String[] args) {
//		LibraryController lib = new LibraryController();
//		lib.library();
		
		
		
		BookDao dao = new BookDao();
//		MemberDao dao = new MemberDao();
		//System.out.println(dao.login("admin", "1234"));
		
//		멤버 idCheck 테스트
//		System.out.println(dao.idCheck("user01"));
		
//		멤버 insert 테스트
//		Member member = new Member("user","1234","사용자",null,null,null);
//		dao.insert(member);
		
//		멤버 delete 테스트
//		dao.delete("user");
		
//		book update 테스트
//		dao.update(11, "Y");
		
//		book Insert 테스트
//		Book book = new Book("불편한편의점2", "나카사키");
//		dao.insert(book);
		
//		book delete 테스트
//		dao.delete(1);

//		book getList 테스트		
		List<Book> list = dao.getList();
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
//		리스트를 출력하면 리스트의 요소들의 toString이 출력된다.
//		[]로 묶어서 출력됨
		System.out.println(dao.getList().toString());
		System.out.println("=========================");
		
		System.out.println(dao.getList());
	}

}

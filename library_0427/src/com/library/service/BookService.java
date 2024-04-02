package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
	BookDao dao = new BookDao();
	
	public List<Book> getList() {
		List<Book> list = dao.getList();
		
		for(Book book : list) {
			System.out.println(book);
		}
		return list;
	}
	
	/**
	 * 도서 정보 입력
	 */
	public void insert(String title, String author) {
		Book book = new Book(title, author);
		int res = dao.insert(book);
		if(res > 0) {
			System.out.println("도서 "+res+"건 등록되었습니다");
		} else {
			System.err.println("도서 등록 중 오류가 발생 하였습니다");
			System.err.println("관리자에게 문의 해주세요");
		}
		
	}

	public void delete(int no) {
		int res = dao.delete(no);
		if(res>0) {
			System.out.println("도서 "+res+"건 삭제되었습니다");
		} else {
			System.err.println("도서 삭제 중 오류가 발생 하였습니다");
			System.err.println("관리자에게 문의 해주세요");
		}
		
	}

	public void rentBook(int no) {
		// 대여가능한 도서인지 확인
		String rentYN = dao.getRentYN(no);
		if("Y".equalsIgnoreCase(rentYN)) {
			System.err.println("이미 대여중인 도서입니다.");
		} else if("".equals(rentYN)) {
			System.out.println("없는 도서번호 입니다.");
		}
		// 대여처리
		int res = dao.update(no, "Y");
		if(res>0) {
			System.out.println(res + "건 대여되었습니다");
		} else {
			System.out.println("대여 중 오류가 발생했습니다");
			System.out.println("관리자에게 문의 해주세요");
		}
		
	}


	public void returnBook(int no) {
		// 반납 가능한 도서인지 확인
		String rentYN = dao.getRentYN(no);
		if("N".equalsIgnoreCase(rentYN)) {
			System.err.println("반납이 불가능한 도서입니다.");
		} else if("".equals(rentYN)) {
			System.out.println("없는 도서번호 입니다.");
		}
		// 반납 처리
		int res = dao.update(no, "N");
		if(res>0) {
			System.out.println(res + "건 반납되었습니다");
		} else {
			System.out.println("반납 중 오류가 발생했습니다");
			System.out.println("관리자에게 문의 해주세요");
		}
	}

	

	
}

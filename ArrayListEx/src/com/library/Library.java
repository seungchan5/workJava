package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// 책 리스트 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다.
	private List<Book> bookList = new ArrayList<>();
	
	public Library() {
		
	}

	public Library(List<Book> bookList) {
		// 초기화
		this.bookList = bookList;
	}
	
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		// 맨 마지막에 인덱스를 추가하고 객체를 저장
		return bookList.add(book);
	}
	
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다. "+book.toString());
	}
	
	public void updateBook(int index) {
		/*
		 * 1. 인덱스에 들어있는 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
		
	}
	
	@Override
	public String toString() {
		int i = 0;
		// 책의 목록을 출력
		for(Book book : bookList) {
			System.out.println(i+" : "+book.toString());
			i++;
		}
		return super.toString();
	}
	
	
}

package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library_bk {
	
	List<Book> bookList = new ArrayList<>();

	public Library_bk() {
		
	}
	
	public Library_bk(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
	}
	
	@Override
	public String toString() {
		
		for(Book book : bookList) {
			System.out.println(book.getTitle() + " / " + book.getAuthor() + " / " + book.isRent() + "\n");
			
		}
		return super.toString();
	}
	
	
	
}

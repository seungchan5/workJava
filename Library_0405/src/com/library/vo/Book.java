package com.library.vo;

public class Book implements Comparable<Book>{
	// 책의 일련번호
	private int no;
	// 책 제목
	private String title;
	// 책 작가
	private String author;
	// 책 대여여부
	private boolean isRent;
	
	// 생성자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	@Override
	public String toString() {
		return getNo()+ " "+ getTitle() + " "+ getAuthor() + " " + isRent();
	}
	
	public String info() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		return getNo()+ " "+ getTitle() + " "+ getAuthor() + " " + str;
	}
	
	// getter/setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	// 자동 정렬
	@Override
	public int compareTo(Book o) {
		if(this.no>o.getNo()) {
			return 1;
		} else {
			return -1;
			
		}
	}
	
	
}

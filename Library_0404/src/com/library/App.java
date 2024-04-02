package com.library;

import java.util.List;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class App {
	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		lib.insert(1, "오늘도", "우리는", false);
		System.out.println("오늘도 우리는 추가 테스트=======\n");
		System.out.println(lib.toString());
	}
}

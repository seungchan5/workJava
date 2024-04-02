package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		//dao.getBookList();
		List<Book> list = new ArrayList<>();
		list.add(new Book(0, "책1", "저자1", false));
		dao.insertBook(list);
	}

	@Override
	public List<Book> getBookList() {
		System.out.println("책 리스트를 조회");
		List<Book> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));) {

			// 파일 읽어오기
			// null(더이상 읽어올 데이터가 없으면)이 될때까지 읽어오기
			String str = "";
			while ((str = br.readLine()) != null) {
				// 1 타이틀1 작가1 false
				// 읽어온 데이터를 공백으로 구분해서 배열을 생성
				// 공백으로 자르기
				String[] strArry = str.split(" ");

				// 생성자의 타입에 맞게 타입을 변환하여 변수에 저장
				// 책을 생성할 파라메터 만들어주기
				int no = Integer.parseInt(strArry[0]);
				String title = strArry[1];
				String author = strArry[2];
				boolean isRent = Boolean.parseBoolean(strArry[3]);

				// 책을 생성하기
				list.add(new Book(no, title, author, isRent));
			}
			// 리스트에 담기
			for (Book book : list) {
				System.out.println(book.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 리스트 반환
		return list;
	}

	@Override
	public int insertBook(List<Book> list) {
		// true 매개변수를 입력하면 이어쓰기가 됩니다.
		// new FileWriter("bookLis.txt",true)
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			for (Book book : list) {
				fw.write(book.toString() + "\n");
			}

			//fw.write("안녕하세요");

			fw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

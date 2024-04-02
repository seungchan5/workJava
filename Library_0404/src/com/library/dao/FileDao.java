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
	/**
	 * bookList.txt파일에서 데이터를 읽어 생성한 Book List에 담은 후 반환
	 */
	@Override
	public List<Book> getList() {
		System.out.println("FileDao.getList() 시작");
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환
		 */
		// 반납할 자원이 있는 경우를 try() 안에서 생성할 경우 자동으로 close 해줍니다.
		try (FileReader fr = new FileReader("bookList.txt");BufferedReader br = new BufferedReader(fr);){
			
			String str = "";
			// 파일로부터 한줄을 읽어들여 null이 될때까지 반복합니다.
			// null = 파일의 끝
			while((str=br.readLine()) != null) {
				
				Book book = makeBook(str);
				// 리스트 파싱중 오류가 발생한 건은 제외
				if(book != null) {
					list.add(book);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		return list;
	}
	/**
	 * 문자열을 받아서 책을 생성하여 반환합니다.
	 * @param str
	 * @return
	 */
	// 접근제한자 반환타입 메소드명 (매개변수타입 변수명)
	public Book makeBook (String str) {
		// book을 선언합니다 ==> 반환용
		Book book = null;
		try {
			// 0 책1 저자1 false
			// 공백을 이용해서 문자열을 잘라 배열로 저장
			String[] strArry= str.split(" ");
			
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			
			book = new Book(no, title, author, isRent);
			
			
		} catch (Exception e) {
			// 데이터 파싱중 오류가 발생하더라도 프로그램이 종료되지 않도록 try구문을 활용해서 오류를 처리
			// try문을 이용하여 오류 처리
			System.err.println("리스트 생성중 오류가 발생하였습니다.");
			System.err.println("============readLine() : " +str);
		}
		// 책이 정상적으로 설정된 경우 Book 반환
		// 생성 중 오류가 발생시 null 반환
		return book;
	}
	@Override
	public boolean saveFile(List<Book> list) {
		// 리스트를 파일로 저장합니다.
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			for(Book book : list) {
				// 책의 정보를 공백으로 연결하여 반환
				fw.write(book.toString()+"\n");
			}
			// 파일로 출력 합니다.
			fw.flush();
			
			// 파일 출력 성공
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일 출력 실패
		return false;
	}
}

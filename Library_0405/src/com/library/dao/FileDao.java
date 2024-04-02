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

	@Override
	public List<Book> getList() {
		// 파일로부터 데이터를 읽어서 리스트로 반환
		//System.out.println("FileDao.getLis() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();
		
		// 리소스를 자동으로 닫아줍니다. ex) fr.close();
		try (FileReader fr = new FileReader("bookList.txt"); BufferedReader br = new BufferedReader(fr)){
			//BufferedReader는 보조 스트림으로 단독으로 사용 불가능 기본스트림을 매개값으로 넣어줘야함
			
			// readLine() 한줄씩 읽어 오기
			// readLine()으로 읽다가 더 이상 읽을 데이터가 없는 파일의 끝(End Of File)은 null
			String readLine = "";
			// null이면 반복문 탈출
			while((readLine = br.readLine()) != null) {
				// 문자열을 이용해서 Book객체를 생성
				Book book = makeBook(readLine);
				
				if(book != null) {
					list.add(book);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			// e1.printStackTrace();
		}
		
		//System.out.println("FileDao.getLis() 종료");
		return list;
		
	}
	/**
	 * 문자열을 가공(파싱)하여 Book객체를 생성 합니다. 
	 * @param readLine
	 * @return
	 */
	private Book makeBook(String readLine) {
		
		// 강제형변환시 오류가 발생할 수 있음
		// 파일이 올바르지 않은 형태로 저장되어 있을 경우 오류가 발생
		// 프로그램에서 오류가 발생 했을때,
		// 프로그램이 비정상적으로 종료되는것을 막기위해서 예외처리
		try {
			// 공백을 기준으로 배열로 저장
			// 0 책1 작가1 false
			// split()의 반환타입은 String[]
			String[] strArry = readLine.split(" ");
			
			// Book을 생성하기 위해 알맞은 타입으로 저장
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			// 문자열을 boolean타입으로 변환
			boolean isRent = Boolean.parseBoolean(strArry[3]);
	 		
			// 책을 생성
			Book book = new Book(no, title, author, isRent);
			
			// 책을 반환
			return book;
		
		// 오류가 발생할 경우 null을 반환
		} catch (Exception e) {
			// 문자열 가공(파싱)중 오류가 발생했을 경우 메세지 처리, return null 
			System.err.println(readLine + " : 가공(파싱)중 오류가 발생 하였습니다.");
			return null;
		}
		
		
	}
	/**
	 * 리스트를 매개변수로 받아 파일로 출력합니다.
	 */
	@Override
	public boolean listToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			// 리스트에 담긴 책의 정보를 파일로 출력합니다.
			for(Book book : list) {	
				fw.write(book.toString()+"\n");
			}
			
			fw.flush();
			
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(int no) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}
}




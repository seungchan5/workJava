package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		dao.fileSave();
		try (BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));){
			String str = "";
			List<Book> list = new ArrayList<>();
			
			while((str = br.readLine()) != null) {
				String[] strArry = str.split(" ");
				int no = Integer.parseInt(strArry[0]);
				String title = strArry[1];
				String author = strArry[2];
				boolean isRent = Boolean.parseBoolean(strArry[3]);
				
				list.add(new Book(no, title, author, isRent));
			}
			System.out.println("파일로 부터 읽어들인 책 정보를 출력합니다.");
			for(Book book : list) {
				System.out.println(book.toString());
				System.out.println("======================");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "1/타이틀1/작가1/false";
		// 책을 생성하는데 필요한 값들을 구분자를 이용하여 배열에 저장
		// 파라미터로 입력된 구분자를 이용하여 문자열을 자르고 배열로 반환
		String[] strArry= str.split("/");

		//	split 테스트
		int i = 0;
		for(String s : strArry) {
			System.out.println("방번호 : " +i+"  값 : " + s);
		}
		
		// 타입 변환
		int no = Integer.parseInt(strArry[0]);
		String title = strArry[1];
		String author = strArry[2];
		boolean isRent = Boolean.parseBoolean(strArry[3]);
		Book book = new Book(no, title, author, isRent);
		System.out.println("책 정보 출력");
		System.out.println(book.toString());
	}
	/**
	 * 파일을 읽어서 책리스트를 생성
	 */
	public void fileRead() {
		
		try (BufferedReader bf = new BufferedReader(new FileReader("bookList.txt")); ){
			String str = "";
			List<Book> list = new ArrayList<>();
			System.out.println("책 리스트 정보를 읽어옵니다.");
			while((str = bf.readLine()) !=null) {
				
				// 다른 방법
//				int no = Integer.parseInt(strArry[0]);
//				String title = strArry[1];
//				String author = strArry[2];
//				boolean isreturn = Boolean.parseBoolean(strArry[3]);
//				Book book = new Book(no, title, author, isreturn);
//				list.add(book);
				
				// 공백으로 끊어서 배열에 담습니다.
				String[] strArry = str.split(" ");
				// 책을 생성해서 리스트에 담아줍니다.
				list.add(new Book(Integer.parseInt(strArry[0]), strArry[1], strArry[2], Boolean.parseBoolean(strArry[3])));
			}
			System.out.println("생성된 리스트를 출력합니다.");
			for(Book book:list) {
				System.out.println(list.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "1 타이틀1 작가1 false";
		// 구분자로 끊어서 배열로 변환
		// {1, 타이틀1, 작가1, false}
		String[] strArry = str.split("");
		// new Book(1, "타이틀1", "작가1", false);
		new Book(Integer.parseInt(strArry[0]), strArry[1], strArry[2], Boolean.parseBoolean(strArry[3]));
	}
	
	/**
	 * 리스트에 담겨 있던 책의 정보를 출력
	 */
	public void fileSave() {
		// 데이터 생성
				List<Book> list = new ArrayList<>();
				list.add(new Book(1, "제목1", "작가1", false));
				list.add(new Book(2, "제목2", "작가2", false));
				list.add(new Book(3, "제목3", "작가3", false));
				
				// 파일 출력
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));) {
					
					for(Book book : list) {
						// 콘솔창에 출력
						//System.out.println(book.toString());
						bw.write(book.toString());
						bw.newLine();
					}
					
					bw.flush();
					
					System.out.println("파일 출력 완료");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}

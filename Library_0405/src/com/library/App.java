package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;
// app 역할 : 실행 관리자 모드, 사용자 모드
public class App {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 라이브러리 생성
		Library lib = new Library("DB");
		
		// app을 생성하지 않고 getString(), getInt() 메서드를 사용할 수 없다.
		// main메소드는 static 메서드 정적메서드
		// 정적필드에서는 인스턴스필드를 사용할 수 없다.
		// 생성하고 사용해야 합니다.
		App app = new App();
		
		// 로그인 반복 시작
		while(true) {
			// 로그인
			// id를 입력받아서 admin이면 관리자 아니면 사용자
			System.out.print("id : ");
			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해진다.
			// 스캐너로부터 입력을 받아서 리턴해주는 역할
			String id = getString();
			
			outter:
			if(id.equalsIgnoreCase("admin")) {
				System.out.println("관리자 메뉴 입니다.");
				while(true) { // 관리자 반복 시작
				System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 종료");
					System.out.println("메뉴를 입력해주세요");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("책의 일련번호를 입력해주세요");
						int no = getInt();
						System.out.println("책의 제목을 입력해주세요");
						String title = getString();
						System.out.println("책의 저자를 입력해주세요");
						String author = getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println("삭제할 책의 일련번호를 입력해주세요.");
						lib.deleteBook(getInt());
						break;
					case 0:
						System.out.println("로그아웃 합니다.");
						break outter;
					default:
						System.out.println(menu + "는 없는 메뉴 입니다.");
						break;
					}
				} // 관리자 반복 끝
				
				
			} else {
				System.out.println(id+"님 환영합니다.");
				while(true) { // 사용자 메뉴 시작
					System.out.println("1. 도서대여 2. 도서반환 0. 로그아웃 q. 종료");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("대여할 책의 일련번호를 입력해주세요");
						lib.rentBook(getInt());
						break;
					case 2:
						System.out.println("반납할 책의 일련번호를 입력해주세요");
						lib.returnBook(getInt());
						break;
					case 0:
						System.out.println("로그아웃 합니다.");
						break outter;
					default:
						System.out.println(menu + "는 없는 메뉴 입니다.");
						break;
					}
	
				}
			} // 사용자 메뉴 끝
		} // 로그인 반복 끝
		
		
		// admin - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		
		
		// 책 추가
//		lib.insertBook(1, "불편한편의점", "나카사키", false);
//		lib.insertBook(2, "불편한편의점2", "나카사키", false);
//		
//		// System.out.println(lib); --> lib.toString()
//		// System.out.println(lib.toString());
//
//		
//		// 책 삭제
//		int no = 0;
//		boolean res = false;
//		res = lib.deleteBook(1);
//	
//		res = lib.rentBook(2);
//		res = lib.returnBook(2);
	}
	/**
	 * 사용자로부터 입력받은 문자열을 반환 합니다.
	 * 숫자가 입력될 경우 다시 입력을 요청합니다.
	 * Q 또는 q 가 입력될 경우 프로그램 종료
	 * @return
	 */
	public static String getString() {
		String str = "";
		while(true){
			try {
				str = scan.next();
				// Q, q가 입력되었으면 프로그램 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}	
				// 숫자로 변환시 숫자로 변경되면 문자를 입력해달라고 다시 요청
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요");
			} catch (Exception e) {
				// 문자가 입력된경우 반복문 탈출
				break;
			}
		}
		return str;
	}
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * - 문자가 입력되었을 경우 다시 입력받습니다.
	 * - Q나 q가 입력되었을 경우 프로그램 종료
	 * @return
	 */
	public static int getInt() {
		int i=0;
		String str = "";
		while(true) {
			try {
				// 사용자 입력받기
				str = scan.next();
				// q인지 확인하기
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
					break;					
			} catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.err.println("숫자만 입력해주세요.");
				
			}
		
		}
		return i;
	}
}










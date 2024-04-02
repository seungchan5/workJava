package com.library;

import java.util.Scanner;

public class Application {
	// 인스턴스 멤버 -> 생성 후 사용
	// 래퍼런스 변수명으로 사용
	Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		// 인스턴스 멤버는 생성 후 사용이 가능
		// scan.next(); => 오류
		Application app = new Application();
		
		// 생성 후 사용
		// app.scan.next();
		// app.getInt();
		// app.getString();
		
		// 도서관 생성
		Library lib = new Library("file");
		
		// 로그아웃 처리시 다시 실행
		while(true) {
			// 로그인 처리
			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();
			
			if("admin".equalsIgnoreCase(id)) {
				//관리자 메뉴
				app.adminMenu(lib);
			} else {
				// 사용자 메뉴
				app.memberMenu(lib);
			
			}
		}
	}
	private void adminMenu(Library lib) {
			while(true) {
				// 관리자
				// 도서목록 출력
				lib.info();
				// 메뉴 확인
				System.out.println("1. 도서등록 / 2. 도서삭제 / 0. 로그아웃 / q. 프로그램 종료");
				System.out.println("메뉴를 입력해주세요");
				int menu = getInt();
				int no = 0;
				switch (menu) {
				case 1:
					// 도서 등록
					System.out.println("일련번호를 입력해주세요");
					no = getInt();
					System.out.println("제목을 입력해주세요");
					String title = getString();
					System.out.println("작가를 입력해주세요");
					String author = getString();
					
					lib.insertBook(no, title, author, false);
					break;
				case 2:
					// 도서 삭제
					System.out.println("삭제할 책의 일련번호를 입력해주세요");
					no = getInt();
					lib.deleteBook(no);
					break;
				case 0:
					// 로그아웃
					System.out.println("로그아웃 합니다.");
					return;	
					
				default:
					System.out.println("메뉴를 확인 후 다시 입력해주세요");
					break;
				}
			}
	}
	private void memberMenu(Library lib) {
		{
			// 사용자
			// 메뉴별로 작업 수행
			while(true) {
				// 도서목록 출력
				lib.info();
				// 메뉴 확인
				System.out.println("1. 도서대여 / 2. 도서 반납 / 0. 로그아웃 / q. 프로그램 종료");
				System.out.println("메뉴를 입력해주세요");
				int menu = getInt();
				if(menu==1) {
					System.out.println("도서번호를 입력해주세요");
					int index = getInt();
					lib.rentBook(index);			
				} else if(menu==2) {
					System.out.println("도서번호를 입력해주세요");
					int index = getInt();
					lib.returnbook(index);
				} else if(menu==0){
					System.out.println("로그아웃 합니다.");
					break ;
				} else {
					System.err.println("메뉴를 확인해주세요.");
				}
				
			}
		}
	}
	/**
	 * 사용자로부터 숫자를 입력 받는다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				
				i = Integer.parseInt(str);
				
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요");
			}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력 받는다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {	
			try {
				res = scan.next();
				// 숫자인 경우 다시 받아올수 있도록 처리
				// 띄어쓰기 포함고 싶으면 nextLine()
				try {
					// 숫자로 변환 
					Integer.parseInt(res);
					System.err.println("문자를 입력해주세요.");
					// 숫자로 변환되면 입력을 다시 받아 올수 있도록 하기
					continue;
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다");
				System.err.println("문자를 입력해주세요");
			}
		}
		return res;
	}
	
	
}

package com.library;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		App app = new App();
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이 : "+ app.getAge());
		System.out.println("이름을 입력해주세요.");
		System.out.println("이름 : "+ app.getName());
		
	}
	
	public int getAge() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
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
	
	public String getName() {
		String res = "";
		while(true) {	
			try {
				res = scan.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요");
			}
		}
		return res;
		 
	}
}

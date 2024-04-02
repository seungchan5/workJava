package member.service;

import java.util.Scanner;

public class MemberServiceMain2 {

	public static void main(String[] args) {
		MemberService2 mem = new MemberService2("홍", "12345");
		
		int i = 0;
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scan.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = scan.next();
		boolean res = mem.login(id, pw);
		if(res) {
			System.out.println(mem.id+"님 로그인 되었습니다");
			break;
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다\n");
			i++;
			if(i>=5) {
				System.out.println("시스템을 종료합니다. (비번불일치 5회초과)");
				System.exit(0);
			}
		}
//		boolean res = mem.login(id, pw);
//		if(res) {
//			System.out.println(mem.id+"님 로그인 되었습니다");
//			mem.logout("");
//		} else {
//			System.out.println("id 또는 password가 올바르지 않습니다");
//		}
		}
	}

}

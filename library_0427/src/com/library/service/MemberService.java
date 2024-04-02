package com.library.service;

import java.util.List;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	/**
	 * 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		Member member = null;
		member = dao.login(id, pw);
		if(member==null) {
			System.out.println("아이디/비밀번호를 확인해주세요");
		} else {
			System.out.println(member.getName()+"님 환영합니다");
		}
		
		return member;
	}

	public void insert(String id, String pw, String name, String adminYN) {
		
		
			Member member = new Member(id, pw, name, adminYN, null, null);
			int res = dao.insert(member);
			if(res > 0) {
				System.out.println("아이디 "+res + "건 등록되었습니다");
			} else {
				System.err.println("아이디 등록 중 오류가 발생했습니다");
				System.err.println("관리자에게 문의 해주세요.");
			}
		
	}

	public void delete(String delId) {
		int res = dao.delete(delId);
		if(res>0) {
			System.out.println("아이디 "+res + "건 삭제되었습니다");
		} else {
			System.err.println("아이디 삭제 중 오류가 발생했습니다");
			System.err.println("관리자에게 문의 해주세요.");
		}
		
	}

	public Boolean idCheck(String id) {
		boolean idCheck = dao.idCheck(id);
		if(idCheck) {
			System.out.println("사용가능한 아이디 입니다.");
			return true;
		} else {
			System.err.println("아이디가 중복 되었습니다.");
			return false;
		}
	}

}

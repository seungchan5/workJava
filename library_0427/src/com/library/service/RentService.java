package com.library.service;



import com.library.dao.RentDao;

public class RentService {
	RentDao dao = new RentDao();
	
	public String getRentYN(int no) {
		String rentYN = dao.getrentYN(no);
		return rentYN;
	}
	/**
	 * 도서대여
	 * 
	 * 대여 테이블에 데이터를 입력합니다
	 * @param no : 도서번호
	 * @param id : 아이디
	 */
	public void rentbook(int no, String id) {
		// 대여 가능 여부 체크
		String rentYN = dao.getrentYN(no);
		if("Y".equals(rentYN)) {
			System.err.println("이미 대여중인 도서 입니다.");
			return;
		}
		// 대여 실행
		int res = dao.insert(id, no);
		
		if(res>0) {
			System.out.println(res+"건 대여 되었습니다.");
		}
	}
	
	public void returnbook(int no) {
		// 반납 가능 여부 체크
		String rentYN = dao.getrentYN(no);
		if("N".equals(rentYN)) {
			System.err.println("반납 가능한 도서가 아닙니다");
			return;
		}
		// 반납 실행
		int res = dao.update(no);
		
		if(res>0) {
			System.out.println(res+"건 반납되었습니다." );
		}
		
	}
}

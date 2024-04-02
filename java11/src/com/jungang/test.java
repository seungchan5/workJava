package com.jungang;

// 한줄주석 ctrl + /

/*
 * 여러줄 주석
 * (범위주석)
 * 
 * 
 */

/**
 * Java Doc을 만들때 사용할 수 있다
 * @author user
 *
 */

public class test {
	
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		// 콘솔에 출력하는 문장
		System.out.println("테스트");
		
		// 명령문의 끝은 ;(세미콜론)으로 마무리
		// 세미콜론이 없으면 컴파일 오류가 발생
		
		// int : 정수를 저장 할수 있는 변수 x를 선언
		int x;
		// 변수 x에 1을 대입
		// = 대입연산자 : 오른쪽에 있는 값을 왼쪽에 대입
		x = 1;
		
		// 변수 선언과 동시에 값을 저장
		int y = 2;
		
		// 수의 연산
		int result = x+y;
		
		// 문자와 숫자의 연산 (+)
		System.out.println("결과 : " +result);

	}

}

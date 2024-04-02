package com.jungang;

public class Calculator {
	
	// 필드
	// 접근제한자를 붙이지 않으면 default(같은 패키지안에 있으면 접근가능)
	// private = 외부 클래스에서 접근할수 없고 해당 클래스 내부에서만 조정이 가능하다
	public String name;
	
	// 생성자의 특징 2가지
	// 1. 클래스의 이름과 동일한 이름을 가지고 있다.
	// 2. 반환타입이 없다.
	// 생성자 : new 연산자를 만나서 객체가 생성될때 실행
	// 생성자가 없으면 컴파일러가 자동으로 생성자를 만들어준다.
	public Calculator() {
		
		// 초기화를 한다
		name = "정수계산기";
		System.out.println(name);
	}
	
	// 접근제한자 반환타입 메소드명(매개변수타입 매개변수명)
	// 정수의 합계를 구하는 메소드 두수를 입력받아 두수의 합을 반환
	/**
	 * 두개의 정수를 입력받아 두수의 합을 반환 합니다.
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	
}

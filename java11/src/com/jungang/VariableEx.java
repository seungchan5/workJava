package com.jungang;

public class VariableEx {

	public static void main(String[] args) {
		// 변수의 선언과 초기화
		// int : 정수를 저장
		// double : 실수를 저장
		// 정수형 변수 value를 선언
		int value;
		
		// 컴파일 오류
		// 변수를 선언하고 초기화 하지 않은경우 오류 발생
		//int res = value +10;
		
		//변수 초기화 -> 메모리에 변수가 생성되었다
		value = 10;
		int res = value + 10;
		
		System.out.print("결과를 출력 합니다. ");
		System.out.println(res);
		System.out.println("감사합니다.");
		
		// 타입 변수명 = 값;
		int weight = 60;
		
		// 키를 미터로 받아야 함 
		// 160 -> 1.6 -> 실수 타입으로 선언
		double height = 1.6;
		
		double bmi = weight/(height*height);
		
		// +연산자가 숫자끼리 나오면 연산 
		// +연산자가 문자열과 함께 나오면 연결
		System.out.println(10+10);
		System.out.println(weight+height+"당신의 BMI는 "+ bmi + " 입니다.");
		
		
	}

}

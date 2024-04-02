package com.jungang;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		// Calculator객체를 생성 후 주소값을 반환
		Calculator calc = new Calculator();
		
		System.out.println("==============");
		
//		System.out.println(calc.name);
//		calc.name = "실수계산기";
//		
//		System.out.println("calc.name = "+calc.name);
		
		// . : 주소접근연산자
		System.out.println(calc.add(5, 7));
		// 재사용할때는 변수에 담아준다
		int addRes = calc.add(5, 7);
		System.out.println(addRes);
	}

}

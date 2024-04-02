package com.mathEx;

public class MathEx {
	public static void main(String[] args) {
		// 절대값
		int i = Math.abs(-5);
		double d = Math.abs(-3.5);
		System.out.println("절대값 : "+i);
		System.out.println("절대값 : "+d);
		
		// 버림
		System.out.println("버림 : "+Math.floor(d));
		
		// 올림
		System.out.println("올림 : "+Math.ceil(d));
		
		// 반올림
		System.out.println("반올림 : "+ Math.round(d));
		
		// 최대값
		System.out.println("최대값 : "+Math.max(5.3, 2.5));
		
		// 최소값
		System.out.println("최소값 : "+Math.min(5.3, 2.5));
				
		long j = Math.round(5.3);
		System.out.println(j);
		
	}
}

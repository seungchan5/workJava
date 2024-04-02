package com.systemEx;

public class SystemEx {
	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기
		// 1/1000초를 구합니다.
		Long startTime = System.currentTimeMillis();
		
//		System.in
//		System.out
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += i;
			if(i == 4) {
				// 프로그램 종료
				System.exit(0);
			}
			// 1초 대기
			Thread.sleep(1000);
		}
		System.out.println("총 합계 : "+ sum);
		
		Long endTime = System.currentTimeMillis();
		long res = (endTime - startTime)/1000;
		System.out.println( res + "초 소요되었습니다.");
		
	}
}

package bmi;

import java.util.Scanner;

/* 접근제한자 class 클래스 명 {
 *    -필드 : 속성을 정의
 *    -메서드 : 기능을 정의
 *    	* mainMethod : 프로그램의 시작, 실행을 담당
 *    -생성자 : 객체를 생성할때 사용
 *    	new를 만나면 생성자를 통해서 객체가 생성이 된다
 *    }
 */

public class BmiEx {
	
	int j =0; // 필드, 전역변수

	public static void main(String[] args) {
		int i = 0; // 지역변수
		
		// 타입 변수명 = new 타입(매개변수);
		// 기본변수는 메모리에 값을 가지고 있다
		// 참조변수는 메모리의 주소값을 가지고 있다
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("BMI");
			System.out.print("키(m) : ");
			String height = scan.next();
			System.out.print("몸무게(kg) : ");
			String weight = scan.next();
			
			double h = Double.parseDouble(height);
			double w = Double.parseDouble(weight);
			
			double bmi = w/(h*h);
			System.out.printf("BMI : %.1f \n",bmi);
			
			/*
			 * BMI가 18.5 이하면 저체중 18.5 ~ 22.9 사이면 정상 23.0 ~ 24.9 사이면 과체중 아니면 비만
			 */
			
			// 삼항연산자
			// 변수 = (조건)?참:거짓;
			String bmiRes = (bmi <= 18.5)?"저체중"
								:(bmi <= 22.9)?"정상"
								:(bmi <= 24.9)?"과체중":"비만";
			
			System.out.println(bmiRes + " 입니다");
			
//			if(bmi<=18.5) {
//				System.out.println("저체중");
//			} else if(bmi<=22.9) {
//				System.out.println("정상");
//			} else if(bmi<=24.9) {
//				System.out.println("과체중");
//			} else {
//				System.out.println("비만");
//			}
			System.out.println("=============");
			System.out.println("계속하려면 q, 계속하려면 아무키나 입력해주세요.");
			String str = scan.next();
			if("q".equals(str)) {
				break;
			}
		}
		scan.close();
		System.out.println("종료");
	}

}

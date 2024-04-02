package bmi;

public class BmiEx {
	// 새로운 추가3
	// 자바 프로그램의 실행점
	public static void main(String[] args) {
		
		// 새로운 추가1
		// 새로운 추가2
		
		// 출력하고 줄바꿈
		// 키 1.6m 몸무게 55kg
		// BMI = 몸무게/ (키 * 키)
		// 변수의타입 변수명 = 값;
		// = 대입연산자
		// 오른쪽에 있는 값을 왼쪽의 변수에 저장
		int weight = 55;
		double height = 1.6;
		// 실수와 정수의 연산
		// 정수 55가 실수 55.0으로 자동형변환 되어짐
		
		double result = weight/(height*height);
		
		System.out.println("환영합니다.");
		System.out.println("당신의 BMI는 " + result + " 입니다.");
		// %d: 정수, %f: 실수, %s: 문자
		System.out.printf("당신의 BMI는 %.1f 입니다.",result);

	}

}

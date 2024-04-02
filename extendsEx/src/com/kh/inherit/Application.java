package com.kh.inherit;

import java.util.Scanner;
import com.kh.inherit.practice.*;

public class Application {

	public static void main(String[] args) {
		/* 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
		 * 데이터를 참고하여 3명의 학생 객체 생성
		 * 반복문을 통해 출력 */
		// 배열 선언 : 같은타입의 데이터를 여러개 보관
		// 배열 선언 : 타입[ ] 변수명 = new 타입[길이];
		Student[] sArry = new Student[3];
		
		// 학생 객체를 생성 후 배열에 담기
		Student s1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArry[0] = s1;
		
		sArry[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArry[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student s : sArry) {
			System.out.println(s.information());
		}	
		/* 1. 최대 10명의 사원 정보를 기록할 객체 배열 생성
		 * 2. 키보드로 사원 정보를 입력 받도록 구현 */
		// employee 타입을 담을 수 있는 10개의 방이 생성되고 참조변수의 초기값인 null로 초기화 됨
		Employee[] empArry = new Employee[10];
		Scanner scan = new Scanner(System.in);
		
		int index = 0;
		while(true) {
			
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("나이 : ");
			int age = scan.nextInt();
			System.out.println("신장 : ");
			double height = scan.nextDouble();
			System.out.println("몸뭄게 : ");
			double weight = scan.nextDouble();
			System.out.println("급여 : ");
			int salary = scan.nextInt();
			System.out.println("부서 : ");
			String dept = scan.next();
			
			// 매개변수 생성자를 이용하여 필드를 초기화
			Employee emp = new Employee(name, age, height, weight, salary, dept);
			// 사용자로부터 입력받은 값으로 사원을 생성하고 배열에 저장
			empArry[index] = emp;
			
			// 사원이 입력된 후 다음번 방으로 이동
			index++;
			
			// 반복문 탈출
			System.out.println("종료하시려면 n을 입력해주세요");
			String next = scan.next();
			if(next.equals("n") || index==10) {
				break;
			}
		}
		
		for(Employee e : empArry) {
			// null 체크
			// 배열이 초기화 될때 null값으로 초기화
			// e. <-- 주소접근연산자인 .을 이용할 경우
			// null은 주소를 가지고 있지 않으므로 오류가 발생
			if(e == null) {
				break;
			}
			System.out.println(e.information());
		}
		
	}
	
	

}

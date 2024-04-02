package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double height, weight;
		
		// 사용자가 숫자를 입력할때까지 반복
		while(true) {			
			// 숫자를 받아 옵니다.
			try {
				System.out.println("키를 입력해주세요(m) : ");
				height = scan.nextDouble();	
				// 유효 범위를 초과한 경우
				if(height>3) {
					System.err.println("키는 3m를 넘을 수 없습니다.");
					continue;
				} 
					break;					
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.err.println(str+ "는 입력할 수 없습니다.\n숫자를 입력해주세요");
			}
		}
		while(true) {			
			// 숫자를 받아 옵니다.
			try {
				System.out.println("몸무게를 입력해주세요(kg) : ");
				weight = scan.nextDouble();
				// 사용자의 입력값 범위를 체크
				if(weight > 200 || weight < 20) {
					System.err.println("몸무게는 20보다 크고 200보다 작은 값을 입력 해야 합니다");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.err.println(str+ "는 입력할 수 없습니다.\n숫자를 입력해주세요");
			}
		}
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		double bmi = weight/(height*height);
		System.out.printf("당신의 BMI는 %.2f 입니다",bmi);
		
	}
}

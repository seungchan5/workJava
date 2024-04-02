package scanner;

import java.io.IOException;
import java.util.Scanner;

public class BmiInt {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(true) {
			// 키를 입력받는다
			System.out.print("키를 입력하세요(단위:m) :");
			double height = scan.nextDouble();
			// 몸무게를 입력 받는다
			System.out.print("몸무게를 입력하세요(단위:kg): ");
			double weight = scan.nextDouble();
			
			double bmi = weight/(height*height);
			// bmi를 출력한다
			System.out.printf("당신의 Bmi는 %.2f 입니다.\n", bmi);
			
			if(bmi <= 18.5) {
				System.out.println("저체중입니다.");
			} else if(bmi <= 22.9) {
				System.out.println("정상입니다.");
			} else if(bmi <= 24.9) {
				System.out.println("과체중입니다.");
			} else {
				System.out.println("비만입니다.");
			}
			System.out.println("===============");
		}
		//scan.close();
		

	}
}

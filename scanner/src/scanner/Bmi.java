package scanner;

import java.io.IOException;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		System.out.println("키를 입력해주세요 : ");
		// 변수이름. 
		String height = scan.next();
		System.out.printf("당신의 키는 %sm 입니다.\n", height);
		
		// 몸무게를 입력해주세요
		System.out.println("몸무게를 입력해주세요 : ");
		// 몸무게를 입력 받고 출력
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %skg 입니다.\n\n", weight);
		
		double w = Double.parseDouble(weight);
		double h = Double.parseDouble(height);
		
		double bmi = w/(h*h);
		System.out.printf("당신의 Bmi는 %.3f 입니다\n\n", bmi);
		
		//scanner가 사용하고 있던 리소스를 반납
		scan.close();
		
	}

}

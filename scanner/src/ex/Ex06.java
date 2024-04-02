package ex;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. 이름:");
		String name = scan.next();
		System.out.print("2. 주민번호 앞 6자리:");
		int num1 = scan.nextInt();
		System.out.print("3. 전화번호:");
		String num2 = scan.next();
		
		System.out.println(name);
		System.out.println(num1);
		System.out.println(num2);

	}

}

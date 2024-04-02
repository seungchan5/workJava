package forEx;

import java.util.Scanner;

public class Ex04_07_3 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		out :
		while(run) {
			System.out.println("------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				System.out.println("잔액> "+balance);
				break;
			case 2:
				System.out.print("출금액> ");
				int a = scanner.nextInt();
				if(balance<a) {
					System.out.print("잔액이 부족합니다.");
				} else {
					balance -= a;
					System.out.println("잔액> "+balance);
				}
				break;
			case 3:
				System.out.println("잔액> "+balance);
				break;
			case 4:
				break out;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

}

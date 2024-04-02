package forEx;

import java.util.Scanner;

public class Ex04_07_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = 0;
		
		out:
		while(true) {
			System.out.println("-----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			
			int input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.print("예금액> ");
				m += scan.nextInt();
				System.out.println("잔액> "+m);
				break;
			case 2:
				System.out.print("출금액> ");
				int n = scan.nextInt();
				if(m<n) {
					System.out.print("잔액이 부족합니다.");
				} else {
					m -=n;
					System.out.println("잔액> "+m);
				}
				break;
			case 3:
				System.out.println("잔액> "+m);
				break;
			case 4:
				break out;
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
		
	}

}

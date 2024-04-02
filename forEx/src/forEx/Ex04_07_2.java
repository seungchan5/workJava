package forEx;

import java.util.Scanner;

public class Ex04_07_2 {

	public static void main(String[] args) {
		int money = 0;
		Scanner scan = new Scanner(System.in);
		
		// 라벨(이름)을 붙여줍니다.
		out:
		while (true) {
			System.out.println("------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------");
			System.out.print("선택> ");
			// 사용자의 입력을 int타입으로 반환
			int input = scan.nextInt();
			
			// input : 사용자의 입력값
			switch (input) {
			//input == 1
			case 1:
				System.out.print("예금액 > ");
				money += Integer.parseInt(scan.next());
				System.out.println("현재 잔고는 "+money + "입니다.");
				// 반복문, switch 문을 빠져나갑니다.
				break;
				// input이 2이면 실행 합니다.
			case 2:
				System.out.print("출금액 > ");
				int num = scan.nextInt();
				if (money<num) {
					System.out.println("잔액이 부족합니다.");
				} else {
					money -= num;
				}
				break;
				// input이 3이면 실행 합니다.
			case 3:
				System.out.println("잔고 > "+money);
				break;
				// input이 4이면 실행 합니다.
			case 4 :
				//System.exit(0);
				break out;
			}
		}
		// 자원을 반납
		scan.close();
		System.out.println("프로그램이 종료 되었습니다.");
	}

}

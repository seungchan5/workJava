package ifelse;

public class Random {

	public static void main(String[] args) {
		
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위수를 추출하여 double 타입으로 변환
		// 0.00000000...1 - 0.99999999...9
		// 10을 곱했을때 0~9 -> 1 - 10
		// 100을 곱했을때 00~99
		

		int s = (int)(Math.random()*6) + 1;
		System.out.println("주사위 : " + s);
		
		switch (s) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;

		case 3:
			System.out.println("3번이 나왔습니다");
			break;

		case 4:
			System.out.println("4번이 나왔습니다");
			break;

		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;

		default:
			System.out.println("종료");
			break;
		}
		
		double rotto1 = Math.random();
		double rotto2 = Math.random();
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();
		
		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);
		
//		if(s==1) {
//			System.out.println("1번");
//		} else if(s==2) {
//			System.out.println("2번");
//		} else if(s==3) {
//			System.out.println("3번");
//		} else if(s==4) {
//			System.out.println("4번");
//		} else if(s==5) {
//			System.out.println("5번");
//		} else {
//			System.out.println("6번");
//		}
		
		
	}
		
}

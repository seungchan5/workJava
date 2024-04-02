package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		// 두개의 주사위를 던져서 나온 수
		// 1 ~ 6 까지 6개의 수가 나올수 있다.
		// 0.000....1 <= Math.random() < 1
		// 0.000....1 <= Math.random() <0.999...9
		// 0.000....6 <= Math.random() <5.4..... *6을 했을때
		// 1.000....6 <= Math.random() <6.4..... +1을 해서 초기값 지정
		// 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		// 초기값 지정 (+) +1
		while(true) {
			int a = (int)(Math.random()*6+1);
			int b = (int)(Math.random()*6+1);
			
			System.out.print("a="+a);
			System.out.println(" b="+b);
			
			// a,b 합이 5이면 (a,b) 출력 후 종료
			
			if(a+b==5) {
				System.out.printf("(%d,%d)\n",a,b);
				break;
			}
		}

	}

}

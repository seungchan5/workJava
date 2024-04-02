package calc;

public class Car {
	public int gas;
	
	// 생성자 : gas 초기화
	public Car(int gas) {	
		this.gas = gas;
	}	
	
	// 달립니다 출력
	public void run1() {
		System.out.println("달립니다");
		// 내부 메소드를 호출합니다
		stop();
		//이름, 매개변수의 개수, 타입이 일치하는 메소드를 찾아서 실행합니다.
		sound("빵빵");
	}
	// stop 멈춥니다 출력
	public void stop() {
		System.out.println("멈춥니다");
	}
	// sound 빵빵 출력
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	// boolean타입이 반환인 경우 메서드의 이름에 is가 붙는 경우가 많다
	// 기름이 0이면 false를 반환
	public boolean isLeftGas() {
		if(gas>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				//gas -= 1; // gas = gas-1
				gas--;
				
				System.out.println("달립니다");
				System.out.println("남은 기름양 = " + gas);
				if(gas==0) {
					return;
				}
			}else {
				System.out.println("기름이 떨어졌어요");
				System.out.println("남은 기름양 = " +gas);
				// break : 반복문 탈출
				// 메소드를 강제 종료
				return;
			}
		}
	}
}

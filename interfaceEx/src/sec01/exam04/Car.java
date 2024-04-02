package sec01.exam04;

public class Car {
	// 인터페이스는 객체를 생성할 수 없다
	// Tire tire = new Tire();
	// 인터페이스의 구현체인 경우,
	// 인터페이스를 참조변수의 타입으로 사용할 수 있다.
	
	Tire fronttire = new HankookTire();
	Tire backtire = new KumhoTire();
	
	public void run() {
		fronttire.roll();
		backtire.roll();
	}
	
	public Car() {
		
	}
	// 생성자의 매개변수로 사용된 경우
	public Car(Tire fronttire, Tire backtire) {
		this.fronttire = fronttire;
		this.backtire = backtire;
	}
}

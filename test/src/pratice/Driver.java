package pratice;

public class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run(); // 매개값 자식 객체인 Bus를 사용하므로 Bus가 재정의한 run()메소드 실행
	}
}

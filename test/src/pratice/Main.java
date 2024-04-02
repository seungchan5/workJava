package pratice;

public class Main {
public static void main(String[] args) {
	
//	Driver driver = new Driver();
//	Bus bus = new Bus();
//	driver.drive(bus); // Vehicle을 상속한 자식 객체 bus를 매개값으로 사용 가능
//	}				   // 매개값인 자식객체 bus는 자동 타입변환이 이루어져 타입이 부모 타입인 Vehicle로 바뀜

	Vehicle vehicle = new Bus(); 
	// 자식 타입인 Bus타입 생성자로 생성하려던 변수 vehicle의 타입을 부모타입 Vehicle로 선언하여 부모타입으로 자동 타입 변환 
	// Bus()는 부모클래스에 있는 메소드만 실행가능
	Bus bus = (Bus) vehicle;	
	// 부모타입으로 변경됐던 변수 vehicle을 강제로 자식 타입으로 변환하여 다시 자식 클래스의 메소드를 실행할 수 있게 변환
	}
}



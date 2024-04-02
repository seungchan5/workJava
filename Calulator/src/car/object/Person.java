package car.object;

public class Person {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("car.company = " +car.company);
		System.out.println("speed : "+car.speed);
		car.speedUp();
		System.out.println("car.speedUp()");
		System.out.println("speed : "+car.speed);
		car.speed = 100;
		System.out.println("car.speed = 100");
		System.out.println("speed : "+car.speed);
		

	}

	
}

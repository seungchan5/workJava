package sec03.exam02;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}
	
	// 강제로 구현을 위임
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

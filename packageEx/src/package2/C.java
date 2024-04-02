package package2;

public class C {
	
	// 외부에서 생성자 접근 제한
	private C() {
		//B b = new B();
	}
	
	public C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
	}
	private void method2() {
		System.out.println("method2");
	}
}

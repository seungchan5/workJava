package package1;

import package2.C;

public class A {
	// 필드 정의
	C c= new C(1);
	B b= new B();
	
	// 코드 작성불가
	
	// 기능 정의
	public void method1() {
		c.method1();
		// c.method2(); method2는 접근제한자를 private으로 지정해서 사용불가
	}
}

class B {
	// default일 경우 같은 패키지에서 호출 가능
	B() {
		
	}
	
}
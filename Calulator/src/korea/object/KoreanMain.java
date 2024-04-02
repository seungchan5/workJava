package korea.object;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean korean = new Korean("홍길동","123456-1234567");
		korean.name = "전지현";
		korean.ssn = "222222-2222222";
		System.out.println(" korean ==============");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.nation);
		
		
		// 객체 초기화
		Korean hong = new Korean("홍길동", "123456-1234567");
		
		System.out.println(" hong ==============");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		Korean lee = new Korean("이하늬","111111-2222222");
		
		System.out.println(" lee ==============");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);
	}

}

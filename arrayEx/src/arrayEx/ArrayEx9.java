package arrayEx;

public class ArrayEx9 {

	public static void main(String[] args) {
		String[] names  = new String[3];
		names[0] = new String("Java");
		names[1] = new String("Java");
		names[2] = "C#";
		
		// 참조타입에서 == : 참조타입의 변수가 가지고 있는 메모리의 주소를 비교 
		// equals : 문자열 자체를 비교
		if(names[0] .equals(names[1])) {
			System.out.println("0번방 == 1번방");
		} else {
			System.out.println("0번방 != 1번방");
		}

	}

}

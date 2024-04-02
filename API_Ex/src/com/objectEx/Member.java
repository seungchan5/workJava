package com.objectEx;

public class Member {
	public static void main(String[] args) {
		
		Member mem1 = new Member("id");
		System.out.println("=================");
		
		/**
		 * hashCode()
		 * 
		 * 객체를 식별하는 하나의 정수값
		 * object클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리턴 합니다
		 * ===> 객체마다 다른 값을 가집니다.
		 * 
		 * 두 객체가 동등한지 비교하는데 사용되어 집니다.
		 */
		Object obj = new Object();
		obj.equals(new String("안녕"));

		System.out.println(mem1.hashCode());
		// 16진수로 변환
		String str = Integer.toHexString(mem1.hashCode());
		str.equals(str);
		System.out.println("hashCode() 16진수로 변환 : "+str);
		System.out.println(mem1.toString());
		System.out.println("=================");
		Member mem2 = new Member("id");
		// equals :  두 객체를 비교
		System.out.println("mem1.equals(mem2) : "+ mem1.equals(mem2));
		System.out.println(mem1.equals(mem2));
	}
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	/**
	 * this(Member객체)가 가지고 있는 id값과
	 * 매개변수로 받은 Object의 id값이 일치 하는지 비교
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("object.equals() 결과 : " + super.equals(obj));
			System.out.print("Member.equals() 결과 : "+getId().equals(member.id));
			// 객체가 가지고 있는 id값이 같다면 true 아니면 false
			if(this.id.equals(member.id)) {
				return true;
			} else {
				return false;
			}
		}
//		if(this.id == ((Member)obj).getId()) {
//			
//		}
		System.out.println("object.equals" +  super.equals(obj));
		System.out.println();
		// 객체가 가지고 있는 id값이 같다면 true 아니면 false
		
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

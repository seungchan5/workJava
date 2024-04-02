package sec02.exam03;

public class Tire {
	
	//최대 회전수
	// 타이어가 생성될때 매개변수에 의해 초기화
	public int maxRotation;
	
	// 누적 회전수
	public int rotation;
	
	// 타이어 위치
	public String location;
	
	public Tire(String location, int maxRotation) {
		// 필드 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	/**
	 * 타이어 1회전 - rotation 1증가 
	 * 1번 실행 할때마다 누적회전수를 증가시킵니다
	 * 만약 maxRotation(최대회전수)보다 크면 false를 리턴합니다
	 * @return
	 */
	public boolean roll() {
		rotation++; // 타이어 1회전
		System.out.println(location +"누적 회전수 : " + rotation);
		System.out.println(location +"최대 회전수 : " + maxRotation);
		if(rotation >= maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		}
		return true;
	}
}

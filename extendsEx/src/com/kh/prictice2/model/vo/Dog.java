package com.kh.prictice2.model.vo;

public class Dog extends Animal {

	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		//this.weight = weight;
		setWeight(weight);
	}
	
	@Override
	public void speak() {
		// 부모 메서드 호출
		System.out.println(super.toString()+" 몸무게는 "+weight+"kg 입니다");
		// String str = super.toString();
		// System.out.println( str +" 몸무게는 "+weight+"kg 입니다");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}
}

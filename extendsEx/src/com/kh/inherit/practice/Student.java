package com.kh.inherit.practice;

public class Student extends Person 
// class 자식클래스 extends 부모클래스명 -> 클래스 상속
{
	

	private int grade;
	private String major;
	
	public Student() {
		
	
	}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// 부모생성자 호출
		super(age, height, weight); 
		
		// super.age; // private 접근제한자라 접근이 불가
		// protected : 패키지가 달라도 부모자식 관계면 접근가능
		super.name = name;
		
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		// super.inforamtion 반환 타입 String
		String information = super.information();
		return super.information() + " " + getGrade() + " " + getMajor();
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


}		

package com.library.vo;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String adminYN;
	private String status;
	private String grade;
	
	public Member(String id, String pw, String name, String adminYN, String status, String grade) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.adminYN = adminYN;
		this.status = status;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return getId() + " " + " " + getName() + " " + getAdminYN() + " " + getStatus() + " " + getGrade();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}

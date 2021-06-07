package com.javaex.ex14;

public class Student extends Person {

	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		System.out.println("Student()");
	}

	public Student(String name, int age, String schoolName) {
		//super(name, age);
		
		
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	//메소드-gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("------------------------------------");
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("학교:" + schoolName);
		System.out.println("------------------------------------");
	}
	
	
	
	
}

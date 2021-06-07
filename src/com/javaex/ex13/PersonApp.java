package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울고등학교");
		
		/*
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		*/
		
		s01.showInfo();
		
	}

}

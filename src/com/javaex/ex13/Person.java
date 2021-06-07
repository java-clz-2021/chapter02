package com.javaex.ex13;

public class Person {

	//필드
	private String name;
	private int age;
	

	//생성자
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드-gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//데이타확인용 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	//메소드-일반
	public void showInfo() { // 화면출력용 만들기 힘들다, 오래걸린다
		System.out.println("---------------------------------");
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("---------------------------------");
	}

	
	
}

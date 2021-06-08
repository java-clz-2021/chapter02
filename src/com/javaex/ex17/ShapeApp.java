package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		//부모클래스 테스트
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();

		//사각형 테스트
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
		System.out.println(r01.toString());
		
		
		
	}

}

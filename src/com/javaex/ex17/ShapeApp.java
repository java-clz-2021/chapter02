package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		//부모클래스 테스트
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		*/
		
		////////////////////////////////////////////////
		//사각형 테스트
		/*
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3); 	//생성자 순서  Shape(2) -->Rectangle(4)
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		
		//사각형 관리////////////////////////////////////
		//배열 만들기
		Rectangle[] rArray = new Rectangle[3];
		
		
		//사각형 만들기
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3); 	//생성자 순서  Shape(2) -->Rectangle(4)
		Rectangle r02 = new Rectangle("주황", "검정", 4, 4); 	//생성자 순서  Shape(2) -->Rectangle(4)
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5); 	//생성자 순서  Shape(2) -->Rectangle(4)
		
		//배열<--사각형
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		
		//배열을 통해서 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		
		//원 관리////////////////////////////////////
		//배열 만들기
		Circle[] cArray = new Circle[3];
		
		//원 만들기
		Circle c01 = new Circle("빨강", "검정", 6);
		Circle c02 = new Circle("주황", "검정", 7);
		Circle c03 = new Circle("노랑", "검정", 8);
		
		//배열<--원
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//배열을 통해서 그리기
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		//삼각형 관리////////////////////////////////////
		//배열 만들기
		Triangle[] tArray = new Triangle[3];
		
		//삼각형 만들기
		Triangle t01 = new Triangle("파랑", "검정", 10, 10);
		Triangle t02 = new Triangle("남색", "검정", 11, 11);
		Triangle t03 = new Triangle("보라", "검정", 12, 12);
		
		//배열<--삼각형
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//배열을 통해서 그리기
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
	}

}

package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		
		//배열을 만든다.
		Shape[] sArray = new Shape[3];
		
		
		//도형을 만든다
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 5);
		Shape st01 = new Triangle("노랑", "검정", 30, 30);


		//배열<--도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		
		
		//배열을 이용해서 그리기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			
			//오버라이딩을 이용해서 구현할 수 있다
			System.out.println("넓이:" + sArray[i].area());
			
		}
		
		/*
		//오버라이딩 부작용-->추상클래스, 추상메소드 해결
		//area() 부모는 내용을 만들 수 없는 상황
		Shape ss01 = new Shape("검정", "검정"); 
		ss01.area();  // area() 는 함수의 내용이 이상하다
		
	    1. Shape ss01 = new Shape("검정", "검정");   못하도록 한다.
	    2. 섞어쓰기 했을때는 오버라이딩 되도록 한다. 
	       --> 메소드 제목만 만들어준다 
		   --> abstract 를 이용해서 추상 메소드를 만든다.
		       -->제목만 있기 때문제 자식이 내용을 만들어서 오버라디딩 되어 야한다.
		       -->반드시 자식이 같은 이름의 메소드를 만들어야 한다.
		
	    3. 추상메소드 1개라도 있는 클래스는 
	       메모리에 인스턴스화 하면 오류발생
	      
		       
		*/
		
		
	}

}

package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath();
		
		System.out.println(myMath.plus(100, 100));
		
		System.out.println(myMath.plus(100.5, 100.2));
		
		System.out.println(myMath.plus(100.2, 100));
		
		System.out.println(myMath.plus(99, 34.5));
		*/
		
		
		System.out.println(MyMath.plus(99, 99));
		System.out.println(MyMath.plus(10.1, 12.4));
		System.out.println(MyMath.plus(99, 99.4));
		System.out.println(MyMath.plus(99.7, 34));
		
		
		MyMath myMath = new MyMath(); // 이렇게 쓸 이유가 없다
		System.out.println(myMath.plus(100, 100));
	}

}

package com.javaex.ex11;

public class MyMath {
	
	//필드
	private static double pi = 3.14;
	
	//생성자

	
	//메소드 g/s
	
	
	//메소드 일반 //메소드 오버로딩
	public static int plus(int a, int b){
		int result = a + b; // 복잡한 계산식 가정
		return result;  
	}
	
	public static double plus(double a, double b ) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b ) {
		double result = a + b;
		return result;
	}
	
	
	public static double plus(int a, double b ) {
		double result = a + b;
		return result;
	}
	
	
	public static double cirleArea(int radius) {
		double result = radius * radius * pi;
		return result;
	}


}

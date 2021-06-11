package com.javaex.ex21;

import java.util.Scanner;

public class AirthException {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자:");
		num = sc.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0X 1로 처리했습니다.");
			result = 100/1;
			System.out.println(result);
		}finally {
			System.out.println("finally영역");
		}
		
		
		
		
		
		sc.close();
		
	}

}

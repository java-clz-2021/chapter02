package com.javaex.ex06;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//Point 힙에 올리는일
	}
	
	public Point(int x, int y) {
		//Point 힙에 올리는일
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		//Point 힙에 올리는일
		this.x = x;
	}
	
	//같은 생성자가 있다
	/*
	public Point(int y) {
		//Point 힙에 올리는일
		this.y = y;
	}
	*/
	
	
	//메소드-게터세터
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//메소드-일반
	public void draw() {
		//그리는 복잡한 기능을 구현해야된다고 가정.....
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(boolean flag) {
		//그리는 복잡한 기능을 구현해야된다고 가정.....
		
		if(flag == true) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
	
	public void draw(int flag) {
		//그리는 복잡한 기능을 구현해야된다고 가정.....
		
		if(flag == 1) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
}

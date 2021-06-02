package com.javaex.ex02;

public class Goods {
   
	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드(g/s)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getPrice() {
		if(this.price<0) {
			return 0;
		}else {
			return price;
		}
	}

	public void setPrice(int price) {
		
		this.price = price;
		
		/*
		if(price<0) {
			this.price = 0;
		}else {
			this.price = price;
		}
		*/	
	}
	
	//메소드(일반)
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격:" + this.getPrice());
		System.out.println("===========================");
	}
	
	
	


}

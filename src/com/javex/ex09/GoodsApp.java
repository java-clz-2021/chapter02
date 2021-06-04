package com.javex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("그램", 100000);
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();
		
		
	}

}

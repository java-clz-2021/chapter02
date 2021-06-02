package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		//camera.name = "니콘";
		//camera.price = 400000;
		camera.setName("니콘");
		camera.setPrice(-400000);
		
		//System.out.println(camera.getPrice());;
		
		//computer.name = "그램";
		//computer.price = 1000000;
		computer.setName("그램");
		computer.setPrice(1000000);
		
		//cup.name = "머그컵";
		//cup.price = 2000;
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		//System.out.println(camera.name + "," + camera.price);
		//System.out.println(camera.getName() + "," + camera.getPrice());
		//String cameraName = camera.getName();
		camera.showInfo();
		
		//System.out.println(computer.getName() + "," + computer.getPrice());
		computer.showInfo();
		
		//System.out.println(cup.getName() + "," + cup.getPrice());
		cup.showInfo();
		
	}

}

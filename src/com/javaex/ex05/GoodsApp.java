package com.javaex.ex05;


public class GoodsApp {

	public static void main(String[] args) {
		
		
		/*
		Goods camera = new Goods(); //생성자 호출-->디폴트생성자
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		
		//생성자를 또 호출할 수없다
		//camera.Goods("니콘2", 500000);
		
		
		//생성자는 1번만 사용할 수 있다****>말의 의미 꼭 체크해볼것
		//camera.Goods("니콘2", 500000);
		
		
		
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
		
		
		
		*/
		
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		/*
		camera.setName("니콘2");
		camera.showInfo();
		*/
		
		
		
		Goods camera2 = new Goods("니콘2", 500000);
		camera2.showInfo();
		
		
		
		
		camera = new Goods("니콘3", 500);
		camera.showInfo();
		
		


		
		
	}

}

package com.javaex.ex10;

public class GoodsApp {
	// count용도로 static 잘 사용하지 않는다 --> (*배열) --> 리스트
	public static void main(String[] args) {
		
		//int[] intArray = new int[3];
		
		Goods[] goodsArray = new Goods[3];
		System.out.println(goodsArray.length);
		
		
		Goods computer = new Goods("그램", 1000000 );
		Goods camera = new Goods("니콘", 400000);
		
		/*
		computer.showInfo();
		camera.showInfo();
		*/
		
		
		goodsArray[0] = computer; 
		goodsArray[1] = camera;
		
		
		System.out.println(computer.getName());
		System.out.println(goodsArray[0].getName());
	
		int count = 0;
		for(int i=0; i<goodsArray.length; i++) {
			
			if(goodsArray[i] != null) { //배열에 주소가 없지 않으면 --> 주소가 있으면
				count = count + 1;
				goodsArray[i].showInfo();
			}
		}
		
		System.out.println(count);
		
		
	}

}

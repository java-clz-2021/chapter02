package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		//생성자 println되는 값 확인해볼것
		
		//디폴트 생성자 사용
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2021");
		s01.setTrack(3);
		
		s01.showInfo();
		System.out.println("");
		
		
		//파라미터 2개 짜리 생성자 사용
		Song s02 = new Song("거짓말", 2);
		s02.setArtist("BIGBANG");
		s02.setAlbum("Always");
		s02.setComposer("G-DRAGON");
		s02.setYear("2007");
		
		s02.showInfo();
		System.out.println("");
		
		
		//파라미터 6개 짜리 생성자 사용-->생성자 세부순서 확인
		Song s03 = new Song("벚꽂엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4);
		
		s03.showInfo();
		System.out.println("");
	}

}

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	// Controller 역할 : 비즈니스 로직
	// View로부터 데이터를 받아서 가공 or 처리 역할
	// Model의 데이터를 수정하거나 가지고오는 역할 수행
	// View에 결과를 전달
	
	// 곡(Model) 5개를 저장할 수 있는 ArrayList 생성
	ArrayList<Model> musicList = new ArrayList<Model>(5);
	
	// 노래를 재생 / 정지할 수 있는 기능을 가진 객체 생성 -> player.jar (MP3Player 활용)
	MP3Player mp3 = new MP3Player();	// 다른 패키지에서 가져오면 import 
	
	// musicList에 있는 노래 순서를 관리할 수 있는 변수 생성
	int index = 0;	// 전역변수 : 모든 메소드들이 공유할 수 있도록!
	
	// 생성자
	public Controller() {
		// Controller 객체가 생성이 되자마자 음악을 미리 세팅! -> 바로 재생 가능하도록!
		// Model 객체 생성
		// Model m = new Model();
		// musicList.add(m);
		// / : 폴더 안에 들어감
		musicList.add(new Model("attention","뉴진스",30,"music/attention.mp3"));	
		musicList.add(new Model("cookie","뉴진스",50,"music/cookie.mp3"));	
		musicList.add(new Model("ditto","뉴진스",100,"music/ditto.mp3"));	
		musicList.add(new Model("hypeboy","뉴진스",120,"music/hypeboy.mp3"));	
		musicList.add(new Model("OMG","뉴진스",110,"music/OMG.mp3"));	
	}
	
	// 재생
	public void play() {
		
		// 현재 재생중인 음악이 있는지
		if(mp3.isPlaying()) {
			// 현재 재생중인 음악 정지
			mp3.stop();
		}
		
		
		// index가 가리키고 있는 위치에 음악을 재생
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	// 정지
	public void stop() {
		mp3.stop();	// 현재 음악 재생 정지
	}
	
	// 다음 곡 재생
	public void next() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		if(index < musicList.size()-1) {	// index 0~3
			index++;	// 인덱스 1 증가
		}else {	// index 4
			index=0;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	// 이전 곡 재생
	public void pre() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
//		if(index<=0) {	
//			index=musicList.size();
//		}else {
//			index--;
//		}
		if(index>0) {
			index--;
		}else {
			index=musicList.size()-1;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	// 현재 재생중인 곡의 정보 출력
	public void show() {
		System.out.println(musicList.get(index).getSongName()+" - "
				+ musicList.get(index).getSinger());
	}
	
	
	
	
}

package TV클래스설계;
//	class : 객체의 속성(Filed)과 행동(Method)을 정의하는 설계도
public class TV {
// 필드
	String 브랜드이름;
	double 크기;
	int 가격;
	boolean 스마트티비기능지원여부;
	boolean 전원상태;
	int 채널;
	int 볼륨;
	
// 메소드 
// 필드와 연관됨
	public void 전원켜기() {
		전원상태 = true;
	}
	public void 전원끄기() {
		전원상태 = false;
	}
	
	public void 볼륨키우기() {
		볼륨++;
	}
	public void 볼륨줄이기() {
		볼륨--;
	}
	
	public void 채널올리기() {
		채널++;
	}
	public void 채널내리기() {
		채널--;
	}
	public void 채널변경하기(int 변경할채널번호) {
		채널 = 변경할채널번호;
	}
	

}

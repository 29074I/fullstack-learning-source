package 변수;

// <- 주석 : 컴파일 과정에 영향을 끼치지 않는 구문
// 컴파일(compile) : 작성한 코드를 컴퓨터가 알아먹을 수 있게(0,1) 변화하는 과정
// public : 어디에서든 사용가능한
public class Ex01변수 {

	// main method(기능) : 프로그램의 시작점
	public static void main(String[] args) {
		// 1. 변수 선언 : 저장 공간 생성, 값을 넣은 상태 xx
		// 정수형 데이터 저장할 수 있는 변수 선언
		int a;			// 세미콜론(;) : 컴파일		int : 정수형 자료형
		
		// 2. 값 할당 : 생성된 저장 공간(변수)에 값 넣는 것
		a = 20;			// = : 대입연산자, 오른쪽에 있는 값을 왼쪽에 넣겠다.
		
		int a1 = 20;	// 메모리에 공간 할당해줘! 명령어(운영체제)
		// 코드 밑 빨간 줄 => 오류(컴파일오류)
		// 컴파일 오류 : 컴파일 x, 번역이 불가능 -> 실행이 안된다
		// 노란줄 => 경고 (한번 확인해보기) -> 실행은 가능
		// 같은 이름의 변수는 2개이상 선언 불가능
		// 변수 이름 앞에 자료형을 붙이면 새로운 변수를 만드는 것
		
		
		// 3. 상수 선언 : 변하지 않는 수
		final int b;
		b = 30;			// 상수에 최초의 값을 할당
		
		final int c = 20;
		// b = 20;		// 상수에는 값 재할당 불가능
		
		
		
	}

}

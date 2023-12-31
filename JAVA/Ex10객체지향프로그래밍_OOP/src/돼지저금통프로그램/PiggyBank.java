package 돼지저금통프로그램;

public class PiggyBank {
// 필드
	private int money;
	// private -> 클래스 내부의 메서드를 통해서만 접근이 가능한 제한자
	// 필드에 접근할 수 있도록 내부에 메서드를 만들어주자 -> getter / setter
	// getter -> 다른 클래스에서 money에 있는 값을 확인
// 생성자 (constructor)
	// 생성자가 없는 경우 -> 컴파일러가 자동으로 생성
	// 생성자는 반환타입이 없다
	// 생성자는 클래스이름과 동일하다
	public int getMoney() {
		return money;
	}
	// setters -> 다른 클래스에서 money에 있는 값을 수정할 수 있도록
	public void setMoney() {
		this.money=money;
	}
	// this : 현재 클래스를 지칭하는 키워드

	// 객체를 생성함과 동시에 필드를 초기화 시켜주는 생성자를 하나
	// 생성자의 특징 
	// 1) 생성자도 매서드다
	// 2) 생성자는 이름이 클래스의 이름과 동일하다
	// 3) 리턴타입을 지정하지 않는다.(void x)
	// 4) 매개변수로 아무것도 받지 않는 생성자를 기본생성자
	// -> 기본생성자는 생략 (클래스 만들 때 이미 생략되어있음)
	// -> 내가 새로운 생성자를 하나 만들어버리면
	// 기본생성자는 기능을 잃는다.
	public PiggyBank() {
		// 기본생성자도 사용하고싶으면
		// 하나 만들어준다. (오버로딩)
		// 오버로딩 -> 같은 클래스 내에서 동일한 이름으로 메서드
		// 단, 매개변수의 형태가 달라야 함
	}
	public PiggyBank(int money) {
		// main에서 보내준 20000값을 현재 필드에 저장
		this.money=money;
	}
	
// 메소드

	public void deposit(int 입금금액) {
		money += 입금금액;
	}

	public void withdraw(int 인출금액) {
		money -= 인출금액;
	}

	public int showMoney() {
		return money;
	}

}

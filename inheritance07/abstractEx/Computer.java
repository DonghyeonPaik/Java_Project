package inheritance07.abstractEx;

public abstract class Computer { // 추상 클래스: 내부에 추상 메소드가 1개 이상 있어야 함
	
	public abstract void display(); // 추상 메소드: 실행부가 없는 메소드.(선언만 됨)
	// 반드시 자식클래스에서 메소드 오버라이딩을 통해 구현해야 함!
	// 자식 클래스에서 서로 다르게 오버라이딩해서 사용가능.
	
	public void display2() {}
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다. "); // 일반 메소드
	}
	public void turnOff() {
		System.out.println("전원을 끕니다. "); // 일반 메소드
	}
}

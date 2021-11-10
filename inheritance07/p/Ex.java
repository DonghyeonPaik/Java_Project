package inheritance07.p;

public class Ex {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b.set();      // 상속된 클래스의 변수값 할당 [set 메소드에 이미 정해놓은 숫자로]
		b.showInfo(); // 상속된 클래스의 변수값 출력
	}
}

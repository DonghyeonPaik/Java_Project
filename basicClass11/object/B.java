package basicClass11.object;

public class B {
	// 모든 클래스는 Object클래스를 상속받음.
	// java.lang.* 이 자동으로 import되므로 따로 명시할 필요는 없음.
	// 모든 클래스에는 extends Object가 생략되어 있음. 컴파일러 자동 삽입.
	
	B(){} // 다른 생성자가 없다면 기본 생성자를 생략 가능!
	
	int a = 1;
	void b() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.toString();
	}
}

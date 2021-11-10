package inheritance07.lab6_super_error;

public class B extends A {
	public B(int x) {
		super(x);
		// 만약 매개변수 지정을 안하면 부모 클래스에 매개변수 없는 생성자가 없어서 error가 발생함.
		System.out.println("생성자 B");
	}
}

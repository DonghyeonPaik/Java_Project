package inheritance07.lab5_super;

public class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		super(x); // 상위 생성자를 호출함.
		System.out.println("매개변수 생성자 B  "+x);
	}
}

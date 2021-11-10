package inheritance07.abstract_calc;

public abstract class Calculator { // 추상 클래스: 구현부 없이 메소드를 선언만 해두는 것
	
	// 아래 메소드들은 자식 클래스에서 오버라이딩해서 구현해야 함!
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	public abstract int times(int[] b);
}

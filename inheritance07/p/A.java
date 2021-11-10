package inheritance07.p;

public class A {
	private int pri;   // 같은 클래스 내에서만 호출, 사용
	int def;           // 같은 패키지 내에서만 호출, 사용
	protected int pro; // 상속된 다른 패키지에서도 호출, 사용
	public int pub;    // 다른 패키지에서도 호출, 사용
	
	public int setA() {
		pri=5;
		return pri;
	}
}

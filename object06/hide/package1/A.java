package object06.hide.package1;

public class A {
	// field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// method
	public A(boolean b) {}
	A(int b){}
	private A(String S) {}
}

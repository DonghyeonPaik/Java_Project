package object06.hide.package1_1;

public class B {
	public B() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 2;
//		a.field3 = 3; private라서 호출하면 오류 발생
		
		a.method1();
		a.method2();
//		a.method3(); private라서 호출하면 오류 발생
	}
}

package object06.hide.package2_2;

import object06.hide.package1_1.*; // 다른 패키지 참조

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 2; default라서 호출 안됨
//		a.field3 = 3; private라서 호출 안됨
		
		a.method1();
//		a.method2();
//		a.method3();
	}
}

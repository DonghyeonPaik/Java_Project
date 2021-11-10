package object06.hide.package2;

import object06.hide.package1.*; // 다른 패키지 참조

public class C {
	// 생성자 호출
	A a1 = new A(true);
//	A a2 = new A(1); default 생성자라서 안됨
//	A a3 = new A("문자열"); private 생성자라서 안됨
}

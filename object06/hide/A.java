package object06.hide;

import object06.hide.p.B;

public class A {
	public void a() {
		B b = new B();
//		b.m = 20;
//		b.k = 30;
		b.n = 40;
	}
}
/*
 * A는 B나 C와 다른 패키지에 위치해있음. 그래서 default, protected 접근 제한자에 접근 못함.
 * protected까지도 접근하지 못하는 이유? 상속관계가 아니기 때문.
 * 
 */
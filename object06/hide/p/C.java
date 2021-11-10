package object06.hide.p;

class C {
	public void c() {
		B b = new B();
		b.m = 20;
		b.k = 30;
		b.n = 40;
	}
}

/* 
 * b.p()는 B class에 있기 때문에 C class에서는 접근할 수 없음.
 * m, k는 각각 default, protected 접근자이므로 접근 가능함.
 * 
 */

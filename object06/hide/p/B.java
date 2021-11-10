package object06.hide.p;

public class B {
	public int n;
	
	public void n() {
		n = 5;
	}
	
	int m;
	void m() {
		m = 10;
		
	}
	protected int k;
	protected void k() {
		k = 15;
	}
	
	private int p;
	private void p(){
		p = 20;
	}
}

/*
 * B와 C는 서로 p라는 package 안에 같이 있음.
 * n은 public 접근 지정자가 쓰여서 어디서나 접근 가능.
 * m은 default 접근 지정자가 쓰여서 다른 패키지에서는 접근 불가.
 * default는 생략된 상태이기 때문에 추가로 작성하면 오류남!
 * k는 protected 접근 지정자가 쓰여서 같은 패키지 접속 가능, 다른 패키지이면 상속관계일 때 접속 가능.
 * p는 private 접근 지정자가 쓰여서 같은 클래스 안에서만 접근 가능.
 * 
 */
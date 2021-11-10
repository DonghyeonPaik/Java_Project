package inheritance07.constructorExample;

public class ConstructorEx {
	public static void main(String[] args) {
		C c; // 객체 변수 선언
		c = new C(); // 객체 생성: 연속적인 Superclass 호출 [ppt의 46페이지]
		// C를 호출했는데 왜 A 먼저 출력될까? 생성자 호출과 실행이 FILO처럼 이루어지기 때문.
		
		System.out.println(c.a+" "+c.b+" "+c.c);
	}
}
